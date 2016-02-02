import np.com.kist.lms.Authority
import np.com.kist.lms.login.Role
import np.com.kist.lms.login.User
import np.com.kist.lms.login.UserRole

class BootStrap {

    def init = { servletContext ->
        addInitialCredentials()
        addRole()
    }

    def destroy = {
    }

    def addInitialCredentials(){
        Role role = Role.findByAuthority(Authority.ROLE_SUPER_ADMIN)
        if(!role){
            role=new Role(authority:Authority.ROLE_SUPER_ADMIN)

            String username = "root"
            String password = "root"
            if (role.save()) {
                User user = User.findByUsername(username)
                if (!user) {
                    user = new User(username: username, password: password)

                    if (user.save()) {
                        UserRole.create(user, role, true)
                    }
                }
            }
        }
    }
    def addRole(){
        Role role = Role.findByAuthority(Authority.ROLE_USER)
        if(!role){
            role=new Role(authority:Authority.ROLE_USER)
            role.save()
        }

    }
}
