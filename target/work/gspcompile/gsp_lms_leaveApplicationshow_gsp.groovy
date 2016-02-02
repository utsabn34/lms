import np.com.kist.lms.LeaveApplication
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_lms_leaveApplicationshow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/leaveApplication/show.gsp" }
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
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'leaveApplication.label', default: 'LeaveApplication'))],-1)
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
if(true && (leaveApplicationInstance?.leaveType)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("leaveApplication.leaveType.label"),'default':("Leave Type")],-1)
printHtmlPart(15)
invokeTag('fieldValue','g',30,['bean':(leaveApplicationInstance),'field':("leaveType")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (leaveApplicationInstance?.leaveReason)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("leaveApplication.leaveReason.label"),'default':("Leave Reason")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(leaveApplicationInstance),'field':("leaveReason")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (leaveApplicationInstance?.totalDays)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("leaveApplication.totalDays.label"),'default':("Total Days")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(leaveApplicationInstance),'field':("totalDays")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (leaveApplicationInstance?.employee)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("leaveApplication.employee.label"),'default':("Employee")],-1)
printHtmlPart(23)
createTagBody(3, {->
expressionOut.print(leaveApplicationInstance?.employee?.encodeAsHTML())
})
invokeTag('link','g',57,['controller':("employee"),'action':("show"),'id':(leaveApplicationInstance?.employee?.id)],3)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (leaveApplicationInstance?.endDate)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("leaveApplication.endDate.label"),'default':("End Date")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',66,['date':(leaveApplicationInstance?.endDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (leaveApplicationInstance?.leaveId)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("leaveApplication.leaveId.label"),'default':("Leave Id")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(leaveApplicationInstance),'field':("leaveId")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (leaveApplicationInstance?.startDate)) {
printHtmlPart(28)
invokeTag('message','g',82,['code':("leaveApplication.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(29)
invokeTag('formatDate','g',84,['date':(leaveApplicationInstance?.startDate)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (leaveApplicationInstance?.status)) {
printHtmlPart(30)
invokeTag('message','g',91,['code':("leaveApplication.status.label"),'default':("Status")],-1)
printHtmlPart(31)
invokeTag('fieldValue','g',93,['bean':(leaveApplicationInstance),'field':("status")],-1)
printHtmlPart(16)
}
printHtmlPart(32)
createTagBody(2, {->
printHtmlPart(33)
createTagBody(3, {->
invokeTag('message','g',101,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',101,['class':("edit"),'action':("edit"),'resource':(leaveApplicationInstance)],3)
printHtmlPart(34)
invokeTag('actionSubmit','g',102,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(35)
})
invokeTag('form','g',104,['url':([resource:leaveApplicationInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(36)
})
invokeTag('captureBody','sitemesh',106,[:],1)
printHtmlPart(37)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1452219235000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
