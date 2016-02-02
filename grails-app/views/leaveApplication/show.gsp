
<%@ page import="np.com.kist.lms.LeaveApplication" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'leaveApplication.label', default: 'LeaveApplication')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-leaveApplication" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-leaveApplication" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list leaveApplication">
			
				<g:if test="${leaveApplicationInstance?.leaveType}">
				<li class="fieldcontain">
					<span id="leaveType-label" class="property-label"><g:message code="leaveApplication.leaveType.label" default="Leave Type" /></span>
					
						<span class="property-value" aria-labelledby="leaveType-label"><g:fieldValue bean="${leaveApplicationInstance}" field="leaveType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaveApplicationInstance?.leaveReason}">
				<li class="fieldcontain">
					<span id="leaveReason-label" class="property-label"><g:message code="leaveApplication.leaveReason.label" default="Leave Reason" /></span>
					
						<span class="property-value" aria-labelledby="leaveReason-label"><g:fieldValue bean="${leaveApplicationInstance}" field="leaveReason"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaveApplicationInstance?.totalDays}">
				<li class="fieldcontain">
					<span id="totalDays-label" class="property-label"><g:message code="leaveApplication.totalDays.label" default="Total Days" /></span>
					
						<span class="property-value" aria-labelledby="totalDays-label"><g:fieldValue bean="${leaveApplicationInstance}" field="totalDays"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaveApplicationInstance?.employee}">
				<li class="fieldcontain">
					<span id="employee-label" class="property-label"><g:message code="leaveApplication.employee.label" default="Employee" /></span>
					
						<span class="property-value" aria-labelledby="employee-label"><g:link controller="employee" action="show" id="${leaveApplicationInstance?.employee?.id}">${leaveApplicationInstance?.employee?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaveApplicationInstance?.endDate}">
				<li class="fieldcontain">
					<span id="endDate-label" class="property-label"><g:message code="leaveApplication.endDate.label" default="End Date" /></span>
					
						<span class="property-value" aria-labelledby="endDate-label"><g:formatDate date="${leaveApplicationInstance?.endDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaveApplicationInstance?.leaveId}">
				<li class="fieldcontain">
					<span id="leaveId-label" class="property-label"><g:message code="leaveApplication.leaveId.label" default="Leave Id" /></span>
					
						<span class="property-value" aria-labelledby="leaveId-label"><g:fieldValue bean="${leaveApplicationInstance}" field="leaveId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaveApplicationInstance?.startDate}">
				<li class="fieldcontain">
					<span id="startDate-label" class="property-label"><g:message code="leaveApplication.startDate.label" default="Start Date" /></span>
					
						<span class="property-value" aria-labelledby="startDate-label"><g:formatDate date="${leaveApplicationInstance?.startDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${leaveApplicationInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="leaveApplication.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${leaveApplicationInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:leaveApplicationInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${leaveApplicationInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
