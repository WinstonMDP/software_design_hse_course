abstract class Figure(val height: Int, val length: Int) {
    abstract val name: String
    abstract val volume: Double
    abstract val lateralSquare: Double
    abstract val upperSquare: Double
    fun summary() {
        println("Объём $name: $volume")
        println("Площадь боковой проекции: $lateralSquare")
        println("Площадь проекции сверху: $upperSquare")
    }
}

class Cube(length: Int) : Figure(length, length) {
    override val name = "куба"
    override val lateralSquare = (length * length).toDouble()
    override val upperSquare = lateralSquare
    override val volume = upperSquare * length
}

class Cone(height: Int, length: Int) : Figure(height, length) {
    override val name = "конуса"
    val radius = length / 2.0
    override val lateralSquare = height * length / 2.0
    override val upperSquare = Math.PI * radius * radius
    override val volume = height * upperSquare / 3.0
}

class Pyramid(height: Int, length: Int) : Figure(height, length) {
    override val name = "пирамиды"
    override val lateralSquare = height * length / 2.0
    override val upperSquare = (length * length).toDouble()
    override val volume = upperSquare * height / 3.0
}

fun main() {
    print("Введите тип фигуры: ")
    val name = readln()
    print("Введите высоту фигуры: ")
    val height = readln().toInt()
    print("Введите основание/диаметр фигуры: ")
    val length = readln().toInt()
    val figure = when (name) {
        "куб" -> Cube(height)
        "конус" -> Cone(height, length)
        else -> Pyramid(height, length)
    }
    figure.summary()
}
