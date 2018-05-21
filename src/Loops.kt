//Day 6

fun main(args: Array<String>) {
    for(i in 1..10){
        println(i)
    }

    for(i in 10 downTo 1){
        println(i)
    }

    val array = arrayOf("a", "b", "c")
    for(i in 1 until array.size step 2){
        println(array[i])
    }

    //loop with index
    for((index,element) in array.withIndex()){
        println("$index $element" )
    }

    //iterating over map

    val map = mapOf(1 to "one", 2 to "two")

    for((key,value) in map ){
        println("$key $value")
    }

}