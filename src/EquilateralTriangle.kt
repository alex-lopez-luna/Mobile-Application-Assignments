import kotlin.math.sqrt


class EquilateralTriangle(_name: String) : Triangle(_name) {

    private var side: Double = 0.0

    //prompt user to enter information
    override fun setDimensions() {
        print("Enter the side of the Equilateral Triangle: ")
        side = readLine()!!.toDouble()

    }

    //calculate area of square
    override fun getArea(): Double {
       return (sqrt(3.0) / 4.0) * side * side

    }



    override fun printDimensions() {
        println("Equilateral Triangle with side: $side")

    }
}