//Day 6
//Properties gethers and seters

class User{
    val id :String=""
    var name:String =""
    var surname : String =""

    get() = surname.toUpperCase()

    var email : String =""

    set(value) {
        if(isEmailValid(value)) field = value}

    fun isEmailValid( v : String) : Boolean{
        println("$v")
        if(v.isEmpty()){return false}
        else{return true}
    }
}

fun main(args: Array<String>) {
    val user = User()

    user.email = "test@ifd.com"
    println(user.email)

}

