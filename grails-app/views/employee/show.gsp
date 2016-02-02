
<%@ page import="np.com.kist.lms.Employee" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'employee.label', default: 'Employee')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-employee" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-employee" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list employee">
			
				<g:if test="${employeeInstance?.firstName}">
				<li class="fieldcontain">
					<span id="firstName-label" class="property-label"><g:message code="employee.firstName.label" default="First Name" /></span>
					
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${employeeInstance}" field="firstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.middleName}">
				<li class="fieldcontain">
					<span id="middleName-label" class="property-label"><g:message code="employee.middleName.label" default="Middle Name" /></span>
					
						<span class="property-value" aria-labelledby="middleName-label"><g:fieldValue bean="${employeeInstance}" field="middleName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.lastName}">
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="employee.lastName.label" default="Last Name" /></span>
					
						<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${employeeInstance}" field="lastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.employeeId}">
				<li class="fieldcontain">
					<span id="employeeId-label" class="property-label"><g:message code="employee.employeeId.label" default="Employee Id" /></span>
					
						<span class="property-value" aria-labelledby="employeeId-label"><g:fieldValue bean="${employeeInstance}" field="employeeId"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.temporaryAddress}">
				<li class="fieldcontain">
					<span id="temporaryAddress-label" class="property-label"><g:message code="employee.temporaryAddress.label" default="Temporary Address" /></span>
					
						<span class="property-value" aria-labelledby="temporaryAddress-label"><g:fieldValue bean="${employeeInstance}" field="temporaryAddress"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="employee.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${employeeInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.avatarUrl}">
				<li class="fieldcontain">
					<span id="avatarUrl-label" class="property-label"><g:message code="employee.avatarUrl.label" default="Avatar Url" /></span>
					
						<span class="property-value" aria-labelledby="avatarUrl-label"><g:fieldValue bean="${employeeInstance}" field="avatarUrl"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.dateOfBirth}">
				<li class="fieldcontain">
					<span id="dateOfBirth-label" class="property-label"><g:message code="employee.dateOfBirth.label" default="Date Of Birth" /></span>
					
						<span class="property-value" aria-labelledby="dateOfBirth-label"><g:formatDate date="${employeeInstance?.dateOfBirth}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.department}">
				<li class="fieldcontain">
					<span id="department-label" class="property-label"><g:message code="employee.department.label" default="Department" /></span>
					
						<span class="property-value" aria-labelledby="department-label"><g:link controller="department" action="show" id="${employeeInstance?.department?.id}">${employeeInstance?.department?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.designation}">
				<li class="fieldcontain">
					<span id="designation-label" class="property-label"><g:message code="employee.designation.label" default="Designation" /></span>
					
						<span class="property-value" aria-labelledby="designation-label"><g:link controller="designation" action="show" id="${employeeInstance?.designation?.id}">${employeeInstance?.designation?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.employeeStatus}">
				<li class="fieldcontain">
					<span id="employeeStatus-label" class="property-label"><g:message code="employee.employeeStatus.label" default="Employee Status" /></span>
					
						<span class="property-value" aria-labelledby="employeeStatus-label"><g:fieldValue bean="${employeeInstance}" field="employeeStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="employee.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:fieldValue bean="${employeeInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.homePhone}">
				<li class="fieldcontain">
					<span id="homePhone-label" class="property-label"><g:message code="employee.homePhone.label" default="Home Phone" /></span>
					
						<span class="property-value" aria-labelledby="homePhone-label"><g:fieldValue bean="${employeeInstance}" field="homePhone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.isActive}">
				<li class="fieldcontain">
					<span id="isActive-label" class="property-label"><g:message code="employee.isActive.label" default="Is Active" /></span>
					
						<span class="property-value" aria-labelledby="isActive-label"><g:formatBoolean boolean="${employeeInstance?.isActive}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.joinedDate}">
				<li class="fieldcontain">
					<span id="joinedDate-label" class="property-label"><g:message code="employee.joinedDate.label" default="Joined Date" /></span>
					
						<span class="property-value" aria-labelledby="joinedDate-label"><g:formatDate date="${employeeInstance?.joinedDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.maritialStatus}">
				<li class="fieldcontain">
					<span id="maritialStatus-label" class="property-label"><g:message code="employee.maritialStatus.label" default="Maritial Status" /></span>
					
						<span class="property-value" aria-labelledby="maritialStatus-label"><g:fieldValue bean="${employeeInstance}" field="maritialStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.mobilePhone}">
				<li class="fieldcontain">
					<span id="mobilePhone-label" class="property-label"><g:message code="employee.mobilePhone.label" default="Mobile Phone" /></span>
					
						<span class="property-value" aria-labelledby="mobilePhone-label"><g:fieldValue bean="${employeeInstance}" field="mobilePhone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.permanentAddress}">
				<li class="fieldcontain">
					<span id="permanentAddress-label" class="property-label"><g:message code="employee.permanentAddress.label" default="Permanent Address" /></span>
					
						<span class="property-value" aria-labelledby="permanentAddress-label"><g:fieldValue bean="${employeeInstance}" field="permanentAddress"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.resignedDate}">
				<li class="fieldcontain">
					<span id="resignedDate-label" class="property-label"><g:message code="employee.resignedDate.label" default="Resigned Date" /></span>
					
						<span class="property-value" aria-labelledby="resignedDate-label"><g:formatDate date="${employeeInstance?.resignedDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${employeeInstance?.workPhone}">
				<li class="fieldcontain">
					<span id="workPhone-label" class="property-label"><g:message code="employee.workPhone.label" default="Work Phone" /></span>
					
						<span class="property-value" aria-labelledby="workPhone-label"><g:fieldValue bean="${employeeInstance}" field="workPhone"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:employeeInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${employeeInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
