import np.com.kist.lms.Employee
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_lms_employeeshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/employee/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'employee.label', default: 'Employee'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (employeeInstance?.firstName)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("employee.firstName.label"),'default':("First Name")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(employeeInstance),'field':("firstName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.middleName)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("employee.middleName.label"),'default':("Middle Name")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(employeeInstance),'field':("middleName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.lastName)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("employee.lastName.label"),'default':("Last Name")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(employeeInstance),'field':("lastName")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.employeeId)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("employee.employeeId.label"),'default':("Employee Id")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(employeeInstance),'field':("employeeId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.temporaryAddress)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("employee.temporaryAddress.label"),'default':("Temporary Address")],-1)
printHtmlPart(25)
invokeTag('fieldValue','g',66,['bean':(employeeInstance),'field':("temporaryAddress")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.email)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("employee.email.label"),'default':("Email")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(employeeInstance),'field':("email")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.avatarUrl)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("employee.avatarUrl.label"),'default':("Avatar Url")],-1)
printHtmlPart(29)
invokeTag('fieldValue','g',84,['bean':(employeeInstance),'field':("avatarUrl")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.dateOfBirth)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("employee.dateOfBirth.label"),'default':("Date Of Birth")],-1)
printHtmlPart(31)
invokeTag('formatDate','g',93,['date':(employeeInstance?.dateOfBirth)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.department)) {
printHtmlPart(32)
invokeTag('message','g',100,['code':("employee.department.label"),'default':("Department")],-1)
printHtmlPart(33)
createTagBody(3, {->
expressionOut.print(employeeInstance?.department?.encodeAsHTML())
})
invokeTag('link','g',102,['controller':("department"),'action':("show"),'id':(employeeInstance?.department?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.designation)) {
printHtmlPart(34)
invokeTag('message','g',109,['code':("employee.designation.label"),'default':("Designation")],-1)
printHtmlPart(35)
createTagBody(3, {->
expressionOut.print(employeeInstance?.designation?.encodeAsHTML())
})
invokeTag('link','g',111,['controller':("designation"),'action':("show"),'id':(employeeInstance?.designation?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.employeeStatus)) {
printHtmlPart(36)
invokeTag('message','g',118,['code':("employee.employeeStatus.label"),'default':("Employee Status")],-1)
printHtmlPart(37)
invokeTag('fieldValue','g',120,['bean':(employeeInstance),'field':("employeeStatus")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.gender)) {
printHtmlPart(38)
invokeTag('message','g',127,['code':("employee.gender.label"),'default':("Gender")],-1)
printHtmlPart(39)
invokeTag('fieldValue','g',129,['bean':(employeeInstance),'field':("gender")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.homePhone)) {
printHtmlPart(40)
invokeTag('message','g',136,['code':("employee.homePhone.label"),'default':("Home Phone")],-1)
printHtmlPart(41)
invokeTag('fieldValue','g',138,['bean':(employeeInstance),'field':("homePhone")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.isActive)) {
printHtmlPart(42)
invokeTag('message','g',145,['code':("employee.isActive.label"),'default':("Is Active")],-1)
printHtmlPart(43)
invokeTag('formatBoolean','g',147,['boolean':(employeeInstance?.isActive)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.joinedDate)) {
printHtmlPart(44)
invokeTag('message','g',154,['code':("employee.joinedDate.label"),'default':("Joined Date")],-1)
printHtmlPart(45)
invokeTag('formatDate','g',156,['date':(employeeInstance?.joinedDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.maritialStatus)) {
printHtmlPart(46)
invokeTag('message','g',163,['code':("employee.maritialStatus.label"),'default':("Maritial Status")],-1)
printHtmlPart(47)
invokeTag('fieldValue','g',165,['bean':(employeeInstance),'field':("maritialStatus")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.mobilePhone)) {
printHtmlPart(48)
invokeTag('message','g',172,['code':("employee.mobilePhone.label"),'default':("Mobile Phone")],-1)
printHtmlPart(49)
invokeTag('fieldValue','g',174,['bean':(employeeInstance),'field':("mobilePhone")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.permanentAddress)) {
printHtmlPart(50)
invokeTag('message','g',181,['code':("employee.permanentAddress.label"),'default':("Permanent Address")],-1)
printHtmlPart(51)
invokeTag('fieldValue','g',183,['bean':(employeeInstance),'field':("permanentAddress")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.resignedDate)) {
printHtmlPart(52)
invokeTag('message','g',190,['code':("employee.resignedDate.label"),'default':("Resigned Date")],-1)
printHtmlPart(53)
invokeTag('formatDate','g',192,['date':(employeeInstance?.resignedDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (employeeInstance?.workPhone)) {
printHtmlPart(54)
invokeTag('message','g',199,['code':("employee.workPhone.label"),'default':("Work Phone")],-1)
printHtmlPart(55)
invokeTag('fieldValue','g',201,['bean':(employeeInstance),'field':("workPhone")],-1)
printHtmlPart(16)
}
printHtmlPart(56)
createTagBody(2, {->
printHtmlPart(57)
createTagBody(3, {->
invokeTag('message','g',209,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',209,['class':("edit"),'action':("edit"),'resource':(employeeInstance)],3)
printHtmlPart(58)
invokeTag('actionSubmit','g',210,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(59)
})
invokeTag('form','g',212,['url':([resource:employeeInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(60)
})
invokeTag('captureBody','sitemesh',214,[:],1)
printHtmlPart(61)
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
