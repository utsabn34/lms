
<%@ page import="np.com.kist.lms.Designation" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'designation.label', default: 'Designation')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-designation" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-designation" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="description" title="${message(code: 'designation.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="isActive" title="${message(code: 'designation.isActive.label', default: 'Is Active')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'designation.name.label', default: 'Name')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${designationInstanceList}" status="i" var="designationInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${designationInstance.id}">${fieldValue(bean: designationInstance, field: "description")}</g:link></td>
					
						<td><g:formatBoolean boolean="${designationInstance.isActive}" /></td>
					
						<td>${fieldValue(bean: designationInstance, field: "name")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${designationInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
