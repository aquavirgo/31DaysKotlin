import sun.jvm.hotspot.asm.Operand

//Day 14
//Inline

//funkcja onlyIf jest inlainowane do operation lambda function
inline fun onlyIf(check : Boolean, operation: () -> Unit){
    if(check){
        operation()
    }

}

fun main(args: Array<String>) {
    onlyIf(false){println("Hello, Kotlin")}


}