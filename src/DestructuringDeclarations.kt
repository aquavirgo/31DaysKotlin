//Day 3
//Destructing Declaration
data class Color(var r : String,var  g : String,var  b : String)

fun main(args: Array<String>) {

    var color = Color("red","gelb", "blue")
    val (red, green, blue) = color

    println(color.component1())
}