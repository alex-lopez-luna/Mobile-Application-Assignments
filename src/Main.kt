//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //create instance of each shape
    val square: Shape = Square("Square")
    val circle: Shape = Circle("Circle")
    val triangle: Shape = Triangle("Triangle")
    val equilateralTriangle: Shape = EquilateralTriangle("Equilateral Triangle")

    //store shapes in a list
    val shapes: List<Shape> = listOf(square, circle, triangle, equilateralTriangle)

    //ask user for dimensions of each shape
    for (shape in shapes) {
        println("\nDimensions for ${shape.name}")
        shape.setDimensions()
    }

    //print readability
    println("\n================= Shape Details =================")

    //print shape name, dimensions, and area calculated
    for(shape in shapes) {
        println("\nShape: ${shape.name}")
        shape.printDimensions()
        println("Area of ${shape.name}: ${shape.getArea()}")
        println("==================================")
    }


}