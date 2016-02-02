
<%@ page import="np.com.kist.lms.LeaveApplication" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'leaveApplication.label', default: 'LeaveApplication')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-leaveApplication" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-leaveApplication" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="leaveType" title="${message(code: 'leaveApplication.leaveType.label', default: 'Leave Type')}" />
					
						<g:sortableColumn property="leaveReason" title="${message(code: 'leaveApplication.leaveReason.label', default: 'Leave Reason')}" />
					
						<g:sortableColumn property="totalDays" title="${message(code: 'leaveApplication.totalDays.label', default: 'Total Days')}" />
					
						<th><g:message code="leaveApplication.employee.label" default="Employee" /></th>
					
						<g:sortableColumn property="endDate" title="${message(code: 'leaveApplication.endDate.label', default: 'End Date')}" />
					
						<g:sortableColumn property="leaveId" title="${message(code: 'leaveApplication.leaveId.label', default: 'Leave Id')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${leaveApplicationInstanceList}" status="i" var="leaveApplicationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${leaveApplicationInstance.id}">${fieldValue(bean: leaveApplicationInstance, field: "leaveType")}</g:link></td>
					
						<td>${fieldValue(bean: leaveApplicationInstance, field: "leaveReason")}</td>
					
						<td>${fieldValue(bean: leaveApplicationInstance, field: "totalDays")}</td>
					
						<td>${fieldValue(bean: leaveApplicationInstance, field: "employee")}</td>
					
						<td><g:formatDate date="${leaveApplicationInstance.endDate}" /></td>
					
						<td>${fieldValue(bean: leaveApplicationInstance, field: "leaveId")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${leaveApplicationInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
