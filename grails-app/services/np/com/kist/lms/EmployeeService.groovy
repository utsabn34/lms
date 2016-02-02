package np.com.kist.lms

import grails.transaction.Transactional
import np.com.kist.lms.login.Role
import np.com.kist.lms.login.User
import np.com.kist.lms.login.UserRole

@Transactional
class EmployeeService {

    def saveUser(Employee employee){
        User user = User.findByUsername(employee.email)
        Role role=Role.findByAuthority(Authority.ROLE_USER)
        UserRole.create(user,role,true)

    }
}
