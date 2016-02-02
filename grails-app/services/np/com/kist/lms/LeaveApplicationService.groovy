package np.com.kist.lms

import grails.transaction.Transactional

@Transactional
class LeaveApplicationService {

   def getTotalLeaveDays(LeaveApplication leaveApplication){
       def totalDays=DateUtils.calculateTotalDays(leaveApplication.startDate,leaveApplication.endDate)
       return totalDays
    }
}
