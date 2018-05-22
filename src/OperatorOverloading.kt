//Day 15
// Operator overloading

//with ktx
class Spannable{
    fun plusAssign(span : Any){

    }
}
/*
inline operator fun Spannable.plusAssign(span: Any, setSpan(): Unit -> {} ) = setSpan(span,0,length,SPAN_INCLUSIVE_EXCLUSIVE)

val spannable = "Eureka!!!!".toSpannable()

spannable +=StyleSpan(BOLD)
spannable+=UnderlineSpan()
*/

