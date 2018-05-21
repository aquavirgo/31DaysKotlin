//Day 8
//Visibility

//public by default
val isVisible = true

// only in the same file
private val isHidden = true

//internal to compilation 'module'
internal val almostVisible = true

class Foo{
    //public by default
    val isVisible = true

    // visible to my subclasses
    protected val isInheritable = true

    //only in the sam class
    private val isHidden = true
}