package src

class Rectangle(width: Number, height: Number) {

    private val width = width.toDouble()
    private val height = height.toDouble()

    init {
        require(this.width > 0.0 && this.height > 0.0)
    }


    fun area() = width * height

    fun perimeter() = (width * 2) + (height * 2)


    val area get() = area()
    val perimeter get() = perimeter()
}
