import np.com.kist.lms.Authority
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_lms_layoutsmain_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/layouts/main.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge,chrome=1")],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('layoutTitle','g',11,['default':("Grails")],-1)
})
invokeTag('captureTitle','sitemesh',11,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',11,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("width=device-width, initial-scale=1.0")],-1)
printHtmlPart(2)
expressionOut.print(assetPath(src: 'favicon.ico'))
printHtmlPart(3)
expressionOut.print(assetPath(src: 'apple-touch-icon.png'))
printHtmlPart(4)
expressionOut.print(assetPath(src: 'apple-touch-icon-retina.png'))
printHtmlPart(5)
invokeTag('stylesheet','asset',16,['src':("application.css")],-1)
printHtmlPart(1)
invokeTag('stylesheet','asset',17,['src':("main.css")],-1)
printHtmlPart(1)
invokeTag('javascript','asset',18,['src':("application.js")],-1)
printHtmlPart(1)
invokeTag('layoutHead','g',19,[:],-1)
printHtmlPart(6)
})
invokeTag('captureHead','sitemesh',20,[:],1)
printHtmlPart(6)
createTagBody(1, {->
printHtmlPart(7)
invokeTag('image','asset',24,['src':("grails_logo.png"),'alt':("Grails")],-1)
printHtmlPart(8)
createClosureForHtmlPart(9, 2)
invokeTag('link','g',29,['controller':("employee"),'action':("index")],2)
printHtmlPart(10)
createClosureForHtmlPart(11, 2)
invokeTag('link','g',30,['controller':("department"),'action':("index")],2)
printHtmlPart(10)
createClosureForHtmlPart(12, 2)
invokeTag('link','g',31,['controller':("designation"),'action':("index")],2)
printHtmlPart(10)
createClosureForHtmlPart(13, 2)
invokeTag('link','g',32,['controller':("leaveApplication"),'action':("index")],2)
printHtmlPart(14)
createTagBody(2, {->
printHtmlPart(15)
createClosureForHtmlPart(16, 3)
invokeTag('link','g',34,['controller':("logout"),'action':("index")],3)
printHtmlPart(14)
})
invokeTag('ifLoggedIn','sec',35,[:],2)
printHtmlPart(17)
createTagBody(2, {->
printHtmlPart(15)
createClosureForHtmlPart(18, 3)
invokeTag('link','g',37,['controller':("login"),'action':("auth")],3)
printHtmlPart(14)
})
invokeTag('ifNotLoggedIn','sec',38,[:],2)
printHtmlPart(19)
invokeTag('layoutBody','g',43,[:],-1)
printHtmlPart(20)
invokeTag('message','g',45,['code':("spinner.alt"),'default':("Loading&hellip;")],-1)
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',46,[:],1)
printHtmlPart(22)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1452478643000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
