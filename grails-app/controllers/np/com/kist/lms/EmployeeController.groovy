package np.com.kist.lms

import grails.plugin.springsecurity.annotation.Secured
import np.com.kist.lms.login.Role
import np.com.kist.lms.login.User
import np.com.kist.lms.login.UserRole

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
@Secured(["ROLE_SUPER_ADMIN","ROLE_USER"])
class EmployeeController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]
    def employeeService

    def springSecurityService

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)

        if(springSecurityService.authentication.authorities*.authority.contains(Authority.ROLE_SUPER_ADMIN)){
            respond Employee.list(params), model:[employeeInstanceCount: Employee.count()]
        }else if(springSecurityService.authentication.authorities*.authority.contains(Authority.ROLE_USER)){
            respond Employee.findAllByUsername(springSecurityService.currentUser.username), model:[employeeInstanceCount: Employee.count()]
        }
    }

    def show(Employee employeeInstance) {
        respond employeeInstance
    }

    def create() {
        respond new Employee(params)
    }

    @Transactional
    @Secured(["ROLE_SUPER_ADMIN"])
    def save(Employee employeeInstance) {
        if (employeeInstance == null) {
            notFound()
            return
        }
        employeeInstance.username=employeeInstance.email
        employeeInstance.password=employeeInstance.email


        if (!employeeInstance.validate()) {
            respond employeeInstance.errors, view:'create'
            return
        }

        if(employeeInstance.save(flush:true)){
            Role role=Role.findByAuthority(Authority.ROLE_USER)
            UserRole.create(employeeInstance,role,true)
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'employee.label', default: 'Employee'), employeeInstance.id])
                redirect employeeInstance
            }
            '*' { respond employeeInstance, [status: CREATED] }
        }
    }
    @Secured(["ROLE_USER"])
    def edit(Employee employeeInstance) {
        respond employeeInstance
    }

    @Transactional
    @Secured(["ROLE_USER"])
    def update(Employee employeeInstance) {
        if (employeeInstance == null) {
            notFound()
            return
        }
        if (employeeInstance.hasErrors()) {
            respond employeeInstance.errors, view:'edit'
            return
        }

        employeeInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Employee.label', default: 'Employee'), employeeInstance.id])
                redirect employeeInstance
            }
            '*'{ respond employeeInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Employee employeeInstance) {

        if (employeeInstance == null) {
            notFound()
            return
        }

        employeeInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Employee.label', default: 'Employee'), employeeInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'employee.label', default: 'Employee'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
