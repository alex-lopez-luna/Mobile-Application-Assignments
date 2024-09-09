import kotlin.math.PI

class Circle(_name: String) : Shape(_name) {
    private var radius: Double = 0.0




    //prompt user to enter information
    override fun setDimensions() {
        print("Enter the radius of the circle: ")
        radius = readLine()!!.toDouble()
    }

    //calculate area of square
    override fun getArea(): Double {
        return PI * radius * radius
    }


    override fun printDimensions() {
        println("Circle with radius: $radius")

    }

}