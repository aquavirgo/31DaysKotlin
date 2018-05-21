class Person(var name : String, var age : Int)
class Persons(){
    var name :String ?=null
    var age : Int ? = null
}
//Day 1


fun main(args: Array<String>) {
    //val person = Person("Hans", 24)
    val person = Persons()
    val name : String = person.name ?: "unknown"
    val age = person.age ?: 0

    println("Name: $name, age $age")
}