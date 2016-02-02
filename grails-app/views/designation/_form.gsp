<%@ page import="np.com.kist.lms.Designation" %>



<div class="fieldcontain ${hasErrors(bean: designationInstance, field: 'description', 'error')} required">
	<label for="description">
		<g:message code="designation.description.label" default="Description" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="description" required="" value="${designationInstance?.description}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: designationInstance, field: 'isActive', 'error')} ">
	<label for="isActive">
		<g:message code="designation.isActive.label" default="Is Active" />
		
	</label>
	<g:checkBox name="isActive" value="${designationInstance?.isActive}" />

</div>

<div class="fieldcontain ${hasErrors(bean: designationInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="designation.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" required="" value="${designationInstance?.name}"/>

</div>

