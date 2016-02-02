package np.com.kist.lms

import np.com.kist.lms.login.User
import org.grails.databinding.BindingFormat

class Employee extends User{
    String firstName
    String middleName
    String lastName
    String permanentAddress
    String temporaryAddress
    long mobilePhone
    long workPhone
    long homePhone
    String email
    @BindingFormat('dd/MM/yyyy')
    Date dateOfBirth
    Gender gender=Gender.MALE
    MaritialStatus maritialStatus=MaritialStatus.SINGLE
    EmployeeStatus employeeStatus=EmployeeStatus.PROBATION
    String avatarUrl
    @BindingFormat('dd/MM/yyyy')
    Date joinedDate
    @BindingFormat('dd/MM/yyyy')
    Date resignedDate
    String employeeId
    Boolean isActive
    Department department
    Designation designation

    static mapping={
        sort "firstName"

    }
    static constraints = {
        firstName(matches: "[a-zA-Z]+")
        middleName(nullable:true,blank:true)
        lastName(matches: "[a-zA-Z ]+")
        employeeId(unique:true,matches:"[a-zA-Z0-9]+")
        temporaryAddress(nullable: true,blank: true)
        email(email: true)
        resignedDate(nullable:true,blank:true)

    }
    enum Gender{
        MALE,FEMALE,OTHER
    }
    enum MaritialStatus{
        SINGLE,MARRIED,DIVORCED
    }
    enum EmployeeStatus{
        PROBATION,PARTTIME,PERMANENT,TERMINATED
    }

    String toString(){
        firstName+" "+(middleName?(middleName+" "):"") +lastName
    }
}

