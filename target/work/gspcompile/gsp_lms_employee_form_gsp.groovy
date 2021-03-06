import np.com.kist.lms.Employee
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_lms_employee_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employee/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'firstName', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("employee.firstName.label"),'default':("First Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("firstName"),'pattern':(employeeInstance.constraints.firstName.matches),'required':(""),'value':(employeeInstance?.firstName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'middleName', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("employee.middleName.label"),'default':("Middle Name")],-1)
printHtmlPart(5)
invokeTag('textField','g',19,['name':("middleName"),'value':(employeeInstance?.middleName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'lastName', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("employee.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("lastName"),'pattern':(employeeInstance.constraints.lastName.matches),'required':(""),'value':(employeeInstance?.lastName)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employeeId', 'error'))
printHtmlPart(7)
invokeTag('message','g',34,['code':("employee.employeeId.label"),'default':("Employee Id")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("employeeId"),'pattern':(employeeInstance.constraints.employeeId.matches),'required':(""),'value':(employeeInstance?.employeeId)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'temporaryAddress', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("employee.temporaryAddress.label"),'default':("Temporary Address")],-1)
printHtmlPart(5)
invokeTag('textField','g',46,['name':("temporaryAddress"),'value':(employeeInstance?.temporaryAddress)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'email', 'error'))
printHtmlPart(9)
invokeTag('message','g',52,['code':("employee.email.label"),'default':("Email")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['type':("email"),'name':("email"),'required':(""),'value':(employeeInstance?.email)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'avatarUrl', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("employee.avatarUrl.label"),'default':("Avatar Url")],-1)
printHtmlPart(2)
invokeTag('textField','g',64,['name':("avatarUrl"),'required':(""),'value':(employeeInstance?.avatarUrl)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'dateOfBirth', 'error'))
printHtmlPart(11)
invokeTag('message','g',70,['code':("employee.dateOfBirth.label"),'default':("Date Of Birth")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',73,['name':("dateOfBirth"),'precision':("day"),'value':(employeeInstance?.dateOfBirth)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'department', 'error'))
printHtmlPart(12)
invokeTag('message','g',79,['code':("employee.department.label"),'default':("Department")],-1)
printHtmlPart(2)
invokeTag('select','g',82,['id':("department"),'name':("department.id"),'from':(np.com.kist.lms.Department.list()),'optionKey':("id"),'required':(""),'value':(employeeInstance?.department?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'designation', 'error'))
printHtmlPart(13)
invokeTag('message','g',88,['code':("employee.designation.label"),'default':("Designation")],-1)
printHtmlPart(2)
invokeTag('select','g',91,['id':("designation"),'name':("designation.id"),'from':(np.com.kist.lms.Designation.list()),'optionKey':("id"),'required':(""),'value':(employeeInstance?.designation?.id),'class':("many-to-one")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'employeeStatus', 'error'))
printHtmlPart(14)
invokeTag('message','g',97,['code':("employee.employeeStatus.label"),'default':("Employee Status")],-1)
printHtmlPart(2)
invokeTag('select','g',100,['name':("employeeStatus"),'from':(np.com.kist.lms.Employee$EmployeeStatus?.values()),'keys':(np.com.kist.lms.Employee$EmployeeStatus.values()*.name()),'required':(""),'value':(employeeInstance?.employeeStatus?.name())],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'gender', 'error'))
printHtmlPart(15)
invokeTag('message','g',106,['code':("employee.gender.label"),'default':("Gender")],-1)
printHtmlPart(2)
invokeTag('select','g',109,['name':("gender"),'from':(np.com.kist.lms.Employee$Gender?.values()),'keys':(np.com.kist.lms.Employee$Gender.values()*.name()),'required':(""),'value':(employeeInstance?.gender?.name())],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'homePhone', 'error'))
printHtmlPart(16)
invokeTag('message','g',115,['code':("employee.homePhone.label"),'default':("Home Phone")],-1)
printHtmlPart(2)
invokeTag('field','g',118,['name':("homePhone"),'type':("number"),'value':(employeeInstance.homePhone),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'isActive', 'error'))
printHtmlPart(17)
invokeTag('message','g',124,['code':("employee.isActive.label"),'default':("Is Active")],-1)
printHtmlPart(5)
invokeTag('checkBox','g',127,['name':("isActive"),'value':(employeeInstance?.isActive)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'joinedDate', 'error'))
printHtmlPart(18)
invokeTag('message','g',133,['code':("employee.joinedDate.label"),'default':("Joined Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',136,['name':("joinedDate"),'precision':("day"),'value':(employeeInstance?.joinedDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'maritialStatus', 'error'))
printHtmlPart(19)
invokeTag('message','g',142,['code':("employee.maritialStatus.label"),'default':("Maritial Status")],-1)
printHtmlPart(2)
invokeTag('select','g',145,['name':("maritialStatus"),'from':(np.com.kist.lms.Employee$MaritialStatus?.values()),'keys':(np.com.kist.lms.Employee$MaritialStatus.values()*.name()),'required':(""),'value':(employeeInstance?.maritialStatus?.name())],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'mobilePhone', 'error'))
printHtmlPart(20)
invokeTag('message','g',151,['code':("employee.mobilePhone.label"),'default':("Mobile Phone")],-1)
printHtmlPart(2)
invokeTag('field','g',154,['name':("mobilePhone"),'type':("number"),'value':(employeeInstance.mobilePhone),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'permanentAddress', 'error'))
printHtmlPart(21)
invokeTag('message','g',160,['code':("employee.permanentAddress.label"),'default':("Permanent Address")],-1)
printHtmlPart(2)
invokeTag('textField','g',163,['name':("permanentAddress"),'required':(""),'value':(employeeInstance?.permanentAddress)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'resignedDate', 'error'))
printHtmlPart(22)
invokeTag('message','g',169,['code':("employee.resignedDate.label"),'default':("Resigned Date")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',172,['name':("resignedDate"),'precision':("day"),'value':(employeeInstance?.resignedDate)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: employeeInstance, field: 'workPhone', 'error'))
printHtmlPart(23)
invokeTag('message','g',178,['code':("employee.workPhone.label"),'default':("Work Phone")],-1)
printHtmlPart(2)
invokeTag('field','g',181,['name':("workPhone"),'type':("number"),'value':(employeeInstance.workPhone),'required':("")],-1)
printHtmlPart(24)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1452047421000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
