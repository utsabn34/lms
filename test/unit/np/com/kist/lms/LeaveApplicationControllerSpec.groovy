package np.com.kist.lms


import grails.test.mixin.*
import spock.lang.*

@TestFor(LeaveApplicationController)
@Mock(LeaveApplication)
class LeaveApplicationControllerSpec extends Specification {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void "Test the index action returns the correct model"() {

        when: "The index action is executed"
        controller.index()

        then: "The model is correct"
        !model.leaveApplicationInstanceList
        model.leaveApplicationInstanceCount == 0
    }

    void "Test the create action returns the correct model"() {
        when: "The create action is executed"
        controller.create()

        then: "The model is correctly created"
        model.leaveApplicationInstance != null
    }

    void "Test the save action correctly persists an instance"() {

        when: "The save action is executed with an invalid instance"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'POST'
        def leaveApplication = new LeaveApplication()
        leaveApplication.validate()
        controller.save(leaveApplication)

        then: "The create view is rendered again with the correct model"
        model.leaveApplicationInstance != null
        view == 'create'

        when: "The save action is executed with a valid instance"
        response.reset()
        populateValidParams(params)
        leaveApplication = new LeaveApplication(params)

        controller.save(leaveApplication)

        then: "A redirect is issued to the show action"
        response.redirectedUrl == '/leaveApplication/show/1'
        controller.flash.message != null
        LeaveApplication.count() == 1
    }

    void "Test that the show action returns the correct model"() {
        when: "The show action is executed with a null domain"
        controller.show(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the show action"
        populateValidParams(params)
        def leaveApplication = new LeaveApplication(params)
        controller.show(leaveApplication)

        then: "A model is populated containing the domain instance"
        model.leaveApplicationInstance == leaveApplication
    }

    void "Test that the edit action returns the correct model"() {
        when: "The edit action is executed with a null domain"
        controller.edit(null)

        then: "A 404 error is returned"
        response.status == 404

        when: "A domain instance is passed to the edit action"
        populateValidParams(params)
        def leaveApplication = new LeaveApplication(params)
        controller.edit(leaveApplication)

        then: "A model is populated containing the domain instance"
        model.leaveApplicationInstance == leaveApplication
    }

    void "Test the update action performs an update on a valid domain instance"() {
        when: "Update is called for a domain instance that doesn't exist"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'PUT'
        controller.update(null)

        then: "A 404 error is returned"
        response.redirectedUrl == '/leaveApplication/index'
        flash.message != null


        when: "An invalid domain instance is passed to the update action"
        response.reset()
        def leaveApplication = new LeaveApplication()
        leaveApplication.validate()
        controller.update(leaveApplication)

        then: "The edit view is rendered again with the invalid instance"
        view == 'edit'
        model.leaveApplicationInstance == leaveApplication

        when: "A valid domain instance is passed to the update action"
        response.reset()
        populateValidParams(params)
        leaveApplication = new LeaveApplication(params).save(flush: true)
        controller.update(leaveApplication)

        then: "A redirect is issues to the show action"
        response.redirectedUrl == "/leaveApplication/show/$leaveApplication.id"
        flash.message != null
    }

    void "Test that the delete action deletes an instance if it exists"() {
        when: "The delete action is called for a null instance"
        request.contentType = FORM_CONTENT_TYPE
        request.method = 'DELETE'
        controller.delete(null)

        then: "A 404 is returned"
        response.redirectedUrl == '/leaveApplication/index'
        flash.message != null

        when: "A domain instance is created"
        response.reset()
        populateValidParams(params)
        def leaveApplication = new LeaveApplication(params).save(flush: true)

        then: "It exists"
        LeaveApplication.count() == 1

        when: "The domain instance is passed to the delete action"
        controller.delete(leaveApplication)

        then: "The instance is deleted"
        LeaveApplication.count() == 0
        response.redirectedUrl == '/leaveApplication/index'
        flash.message != null
    }
}
