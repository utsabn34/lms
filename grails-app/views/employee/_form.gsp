<%@ page import="np.com.kist.lms.Employee" %>



<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="employee.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" pattern="${employeeInstance.constraints.firstName.matches}" required="" value="${employeeInstance?.firstName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'middleName', 'error')} ">
	<label for="middleName">
		<g:message code="employee.middleName.label" default="Middle Name" />
		
	</label>
	<g:textField name="middleName" value="${employeeInstance?.middleName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="employee.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" pattern="${employeeInstance.constraints.lastName.matches}" required="" value="${employeeInstance?.lastName}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeId', 'error')} required">
	<label for="employeeId">
		<g:message code="employee.employeeId.label" default="Employee Id" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="employeeId" pattern="${employeeInstance.constraints.employeeId.matches}" required="" value="${employeeInstance?.employeeId}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'temporaryAddress', 'error')} ">
	<label for="temporaryAddress">
		<g:message code="employee.temporaryAddress.label" default="Temporary Address" />
		
	</label>
	<g:textField name="temporaryAddress" value="${employeeInstance?.temporaryAddress}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="employee.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="email" required="" value="${employeeInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'avatarUrl', 'error')} required">
	<label for="avatarUrl">
		<g:message code="employee.avatarUrl.label" default="Avatar Url" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="avatarUrl" required="" value="${employeeInstance?.avatarUrl}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'dateOfBirth', 'error')} required">
	<label for="dateOfBirth">
		<g:message code="employee.dateOfBirth.label" default="Date Of Birth" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateOfBirth" precision="day"  value="${employeeInstance?.dateOfBirth}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'department', 'error')} required">
	<label for="department">
		<g:message code="employee.department.label" default="Department" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="department" name="department.id" from="${np.com.kist.lms.Department.list()}" optionKey="id" required="" value="${employeeInstance?.department?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'designation', 'error')} required">
	<label for="designation">
		<g:message code="employee.designation.label" default="Designation" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="designation" name="designation.id" from="${np.com.kist.lms.Designation.list()}" optionKey="id" required="" value="${employeeInstance?.designation?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'employeeStatus', 'error')} required">
	<label for="employeeStatus">
		<g:message code="employee.employeeStatus.label" default="Employee Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="employeeStatus" from="${np.com.kist.lms.Employee$EmployeeStatus?.values()}" keys="${np.com.kist.lms.Employee$EmployeeStatus.values()*.name()}" required="" value="${employeeInstance?.employeeStatus?.name()}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'gender', 'error')} required">
	<label for="gender">
		<g:message code="employee.gender.label" default="Gender" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="gender" from="${np.com.kist.lms.Employee$Gender?.values()}" keys="${np.com.kist.lms.Employee$Gender.values()*.name()}" required="" value="${employeeInstance?.gender?.name()}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'homePhone', 'error')} required">
	<label for="homePhone">
		<g:message code="employee.homePhone.label" default="Home Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="homePhone" type="number" value="${employeeInstance.homePhone}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'isActive', 'error')} ">
	<label for="isActive">
		<g:message code="employee.isActive.label" default="Is Active" />
		
	</label>
	<g:checkBox name="isActive" value="${employeeInstance?.isActive}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'joinedDate', 'error')} required">
	<label for="joinedDate">
		<g:message code="employee.joinedDate.label" default="Joined Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="joinedDate" precision="day"  value="${employeeInstance?.joinedDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'maritialStatus', 'error')} required">
	<label for="maritialStatus">
		<g:message code="employee.maritialStatus.label" default="Maritial Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="maritialStatus" from="${np.com.kist.lms.Employee$MaritialStatus?.values()}" keys="${np.com.kist.lms.Employee$MaritialStatus.values()*.name()}" required="" value="${employeeInstance?.maritialStatus?.name()}" />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'mobilePhone', 'error')} required">
	<label for="mobilePhone">
		<g:message code="employee.mobilePhone.label" default="Mobile Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="mobilePhone" type="number" value="${employeeInstance.mobilePhone}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'permanentAddress', 'error')} required">
	<label for="permanentAddress">
		<g:message code="employee.permanentAddress.label" default="Permanent Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="permanentAddress" required="" value="${employeeInstance?.permanentAddress}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'resignedDate', 'error')} required">
	<label for="resignedDate">
		<g:message code="employee.resignedDate.label" default="Resigned Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="resignedDate" precision="day"  value="${employeeInstance?.resignedDate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: employeeInstance, field: 'workPhone', 'error')} required">
	<label for="workPhone">
		<g:message code="employee.workPhone.label" default="Work Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="workPhone" type="number" value="${employeeInstance.workPhone}" required=""/>

</div>

