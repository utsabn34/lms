<%@ page import="np.com.kist.lms.LeaveApplication" %>



<div class="fieldcontain ${hasErrors(bean: leaveApplicationInstance, field: 'leaveType', 'error')} ">
	<label for="leaveType">
		<g:message code="leaveApplication.leaveType.label" default="Leave Type" />
		
	</label>
	<g:select name="leaveType" from="${np.com.kist.lms.LeaveApplication$LeaveType?.values()}" keys="${np.com.kist.lms.LeaveApplication$LeaveType.values()*.name()}" value="${leaveApplicationInstance?.leaveType?.name()}"  noSelection="['': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: leaveApplicationInstance, field: 'leaveReason', 'error')} ">
	<label for="leaveReason">
		<g:message code="leaveApplication.leaveReason.label" default="Leave Reason" />
		
	</label>
	<g:textField name="leaveReason" value="${leaveApplicationInstance?.leaveReason}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: leaveApplicationInstance, field: 'startDate', 'error')} required">
	<label for="startDate">
		<g:message code="leaveApplication.startDate.label" default="Start Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="startDate" precision="day"  value="${leaveApplicationInstance?.startDate}"  />

</div>


<div class="fieldcontain ${hasErrors(bean: leaveApplicationInstance, field: 'endDate', 'error')} required">
	<label for="endDate">
		<g:message code="leaveApplication.endDate.label" default="End Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="endDate" precision="day"  value="${leaveApplicationInstance?.endDate}"  />

</div>
<sec:ifAnyGranted roles="ROLE_SUPER_ADMIN">
<div class="fieldcontain ${hasErrors(bean: leaveApplicationInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="leaveApplication.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="status" from="${np.com.kist.lms.LeaveApplication$LeaveApplicationStatus?.values()}" keys="${np.com.kist.lms.LeaveApplication$LeaveApplicationStatus.values()*.name()}" required="" value="${leaveApplicationInstance?.status?.name()}" />

</div>
</sec:ifAnyGranted>
<sec:ifAnyGranted roles="ROLE_USER">
	<div class="fieldcontain ${hasErrors(bean: leaveApplicationInstance, field: 'status', 'error')} required">
		<label for="status">
			<g:message code="leaveApplication.status.label" default="Status" />
			<span class="required-indicator">*</span>
		</label>

	<select name="status" required="">
		<option value="${LeaveApplication.LeaveApplicationStatus.Pending}">${LeaveApplication.LeaveApplicationStatus.Pending}</option>
		<option value="${LeaveApplication.LeaveApplicationStatus.Cancelled}">${LeaveApplication.LeaveApplicationStatus.Cancelled}</option>
	</select>
	</div>
</sec:ifAnyGranted>

