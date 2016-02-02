package np.com.kist.lms

class Designation {

    String name
    String description
    Boolean isActive
    static constraints = {
        name(matches: "[a-zA-Z ]+")
        description(matches: "[a-zA-Z]+")
    }
    String toString(){
        return name
    }
}
