package np.com.kist.lms

/**
 * Created by utsabn34 on 25/1/16.
 */
class DateUtils {

    public def static calculateTotalDays(Date startDate, Date endDate){
        if(startDate.compareTo(endDate)<=0){
            return endDate-startDate+1
        }
        return 0
    }
}
