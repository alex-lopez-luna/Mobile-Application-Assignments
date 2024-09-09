

class Square(_name: String) : Shape(_name) {

    private var length: Double = 0.0
    private var height: Double = 0.0


    //prompt user to enter information
    override fun setDimensions() {
        print("Enter the length of the square: ")
        length = readLine()!!.toDouble()
        print("Enter the height of the square: ")
        height = readLine()!!.toDouble()

    }

    //calculate area of square
    override fun getArea(): Double {
        return length * height
    }



    override fun printDimensions() {
        println("Square with length: $length and height: $height")

    }





}