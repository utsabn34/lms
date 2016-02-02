import np.com.kist.lms.Designation
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_lms_designation_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/designation/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: designationInstance, field: 'description', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("designation.description.label"),'default':("Description")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("description"),'required':(""),'value':(designationInstance?.description)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: designationInstance, field: 'isActive', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("designation.isActive.label"),'default':("Is Active")],-1)
printHtmlPart(5)
invokeTag('checkBox','g',19,['name':("isActive"),'value':(designationInstance?.isActive)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: designationInstance, field: 'name', 'error'))
printHtmlPart(6)
invokeTag('message','g',25,['code':("designation.name.label"),'default':("Name")],-1)
printHtmlPart(2)
invokeTag('textField','g',28,['name':("name"),'required':(""),'value':(designationInstance?.name)],-1)
printHtmlPart(7)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1452047774000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
