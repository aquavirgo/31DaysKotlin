//Day 9
//Default argument



class BulletpointSpan(

        private val bulletRadius: Float = 12F,
        private val gapWidth: Int = 13,
        private  val color : Int = 17

        )


fun main(args: Array<String>) {
    val bulletpointSpan = BulletpointSpan()

    val bulletpointSpan2 = BulletpointSpan(12F)

    val bulletpointSpan3 = BulletpointSpan(color = 12)
}