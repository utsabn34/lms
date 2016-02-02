package np.com.kist.lms

import org.grails.databinding.BindingFormat


class LeaveApplication {
    String leaveId = "Default"
    Employee employee
    @BindingFormat('dd/MM/yyyy')
    Date startDate
    @BindingFormat('dd/MM/yyyy')
    Date endDate
    LeaveType leaveType= LeaveType.SICK_LEAVE
    Double totalDays
    String leaveReason
    LeaveApplicationStatus status = LeaveApplicationStatus.Pending



    static constraints = {
        leaveType nullable:true,blank:true
        leaveReason nullable:true,blank:true
        totalDays nullable:true,blank:true

    }
    enum LeaveType{
        ANNUAL,SICK_LEAVE,EMERGENCY_LEAVE,COMPENSATION_LEAVE,MATERNITY_LEAVE,DISASTER_LEAVE,PATERNITY_LEAVE
    }
    enum LeaveApplicationStatus {
        Cancelled, Pending, Approved, Unapproved
    }
}
