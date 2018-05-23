import kotlin.coroutines.experimental.buildSequence

//Day 27
//Sequences

val sequence = List(50){it*5}.asSequence()

fun main(args: Array<String>) {
    println(sequence.map { it *2 } . filter { it %3==0 }.map { it+1 }.toList())


    var list = listOf("lazy", "eagar")
    list.asSequence().filter { it == "lazy" }

    val natural = generateSequence (1){it +1  }

    val zero = buildSequence { while (true) {
        yield(0)
    }}


    println(zero)
}