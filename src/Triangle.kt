import kotlin.math.sqrt


open class Triangle(_name: String) : Shape(_name) {

    private var length_1: Double = 0.0
    private var length_2: Double = 0.0
    private var length_3: Double = 0.0

    //prompt user to enter information
    override fun setDimensions() {
        print("Enter size of length1: ")
        length_1 = readLine()!!.toDouble()
        print("Enter size of length2: ")
        length_2 = readLine()!!.toDouble()
        print("Enter size of length3: ")
        length_3 = readLine()!!.toDouble()
    }

    //calculate area of square
    override fun getArea(): Double {
        val area = (length_1 + length_2 + length_3) / 2.0
        return sqrt(area * (area - length_1) * (area - length_2) * (area - length_3))

    }


    override fun printDimensions() {
        println("Triangle with sides: a = $length_1, b = $length_2, and c = $length_3")

    }
}