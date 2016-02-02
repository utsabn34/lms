import np.com.kist.lms.LeaveApplication
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_lms_leaveApplication_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/leaveApplication/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: leaveApplicationInstance, field: 'leaveType', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("leaveApplication.leaveType.label"),'default':("Leave Type")],-1)
printHtmlPart(2)
invokeTag('select','g',10,['name':("leaveType"),'from':(np.com.kist.lms.LeaveApplication$LeaveType?.values()),'keys':(np.com.kist.lms.LeaveApplication$LeaveType.values()*.name()),'value':(leaveApplicationInstance?.leaveType?.name()),'noSelection':(['': ''])],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: leaveApplicationInstance, field: 'leaveReason', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("leaveApplication.leaveReason.label"),'default':("Leave Reason")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("leaveReason"),'value':(leaveApplicationInstance?.leaveReason)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: leaveApplicationInstance, field: 'startDate', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("leaveApplication.startDate.label"),'default':("Start Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',28,['name':("startDate"),'precision':("day"),'value':(leaveApplicationInstance?.startDate)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: leaveApplicationInstance, field: 'endDate', 'error'))
printHtmlPart(8)
invokeTag('message','g',35,['code':("leaveApplication.endDate.label"),'default':("End Date")],-1)
printHtmlPart(6)
invokeTag('datePicker','g',38,['name':("endDate"),'precision':("day"),'value':(leaveApplicationInstance?.endDate)],-1)
printHtmlPart(9)
createTagBody(1, {->
printHtmlPart(10)
expressionOut.print(hasErrors(bean: leaveApplicationInstance, field: 'status', 'error'))
printHtmlPart(11)
invokeTag('message','g',44,['code':("leaveApplication.status.label"),'default':("Status")],-1)
printHtmlPart(6)
invokeTag('select','g',47,['name':("status"),'from':(np.com.kist.lms.LeaveApplication$LeaveApplicationStatus?.values()),'keys':(np.com.kist.lms.LeaveApplication$LeaveApplicationStatus.values()*.name()),'required':(""),'value':(leaveApplicationInstance?.status?.name())],-1)
printHtmlPart(9)
})
invokeTag('ifAnyGranted','sec',50,['roles':("ROLE_SUPER_ADMIN")],1)
printHtmlPart(12)
createTagBody(1, {->
printHtmlPart(13)
expressionOut.print(hasErrors(bean: leaveApplicationInstance, field: 'status', 'error'))
printHtmlPart(14)
invokeTag('message','g',54,['code':("leaveApplication.status.label"),'default':("Status")],-1)
printHtmlPart(15)
expressionOut.print(LeaveApplication.LeaveApplicationStatus.Pending)
printHtmlPart(16)
expressionOut.print(LeaveApplication.LeaveApplicationStatus.Pending)
printHtmlPart(17)
expressionOut.print(LeaveApplication.LeaveApplicationStatus.Cancelled)
printHtmlPart(16)
expressionOut.print(LeaveApplication.LeaveApplicationStatus.Cancelled)
printHtmlPart(18)
})
invokeTag('ifAnyGranted','sec',63,['roles':("ROLE_USER")],1)
printHtmlPart(19)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1453858641000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
