package np.com.kist.lms

import grails.plugin.springsecurity.annotation.Secured

import static org.springframework.http.HttpStatus.*
import np.com.kist.lms.LeaveApplication.LeaveApplicationStatus
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(["ROLE_SUPER_ADMIN","ROLE_USER"])
class LeaveApplicationController {
    def springSecurityService
    def leaveApplicationService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        if(springSecurityService.authentication.authorities*.authority.contains(Authority.ROLE_SUPER_ADMIN)) {
            respond LeaveApplication.list(params), model: [leaveApplicationInstanceCount: LeaveApplication.count()]
        }else if(springSecurityService.authentication.authorities*.authority.contains(Authority.ROLE_USER)){
             respond LeaveApplication.findAllByEmployee(Employee.findByUsername(springSecurityService.currentUser.username)), model: [leaveApplicationInstanceCount: LeaveApplication.count()]
        }
    }

    def show(LeaveApplication leaveApplicationInstance) {
        respond leaveApplicationInstance
    }

    def create() {
        respond new LeaveApplication(params)
    }

    @Transactional
    def save(LeaveApplication leaveApplicationInstance) {
        if (leaveApplicationInstance == null) {
            notFound()
            return
        }
          leaveApplicationInstance.totalDays =leaveApplicationService.getTotalLeaveDays(leaveApplicationInstance)
        leaveApplicationInstance.employee =Employee.findByUsername(springSecurityService.currentUser.username)
        leaveApplicationInstance.status = LeaveApplicationStatus.Pending


        if (!leaveApplicationInstance.validate()) {
            respond leaveApplicationInstance.errors, view: 'create'
            return
        }

        leaveApplicationInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'leaveApplication.label', default: 'LeaveApplication'), leaveApplicationInstance.id])
                redirect leaveApplicationInstance
            }
            '*' { respond leaveApplicationInstance, [status: CREATED] }
        }
    }

    def edit(LeaveApplication leaveApplicationInstance) {
        respond leaveApplicationInstance
    }

    @Transactional
    def update(LeaveApplication leaveApplicationInstance) {
        if (leaveApplicationInstance == null) {
            notFound()
            return
        }

        if (leaveApplicationInstance.hasErrors()) {
            respond leaveApplicationInstance.errors, view: 'edit'
            return
        }

        leaveApplicationInstance.save flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'LeaveApplication.label', default: 'LeaveApplication'), leaveApplicationInstance.id])
                redirect leaveApplicationInstance
            }
            '*' { respond leaveApplicationInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(LeaveApplication leaveApplicationInstance) {

        if (leaveApplicationInstance == null) {
            notFound()
            return
        }

        leaveApplicationInstance.delete flush: true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'LeaveApplication.label', default: 'LeaveApplication'), leaveApplicationInstance.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'leaveApplication.label', default: 'LeaveApplication'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
