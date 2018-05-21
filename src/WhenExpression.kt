//Day 4
//When expression


class Train(val cargo:Number?){
    override fun toString(): String {
        return when (cargo){
            null, 0 -> "empty"
            1 -> "tiny"
            in 2..10 -> "small"
            is Int -> "big inty"
            else -> "$cargo"
        }
    }
}

fun main(args: Array<String>) {
    val train = Train(0)

    println(train)
}