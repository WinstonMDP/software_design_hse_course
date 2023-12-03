fun main(args: Array<String>) {
    val size = args[0].toInt()
    val array = Array<IntArray>(size){ IntArray(size) }
    for (i in 0..<size) {
        for (j in 0..<size) {
            array[i][j] = (0..<10).random()
            print(array[i][j])
            print(" ")
        }
        println()
    }
    var sum = 0;
    for (i in 1..<size) {
        for (j in 0..<i) {
            sum += array[i][size - j - 1]
        }
    }
    println("Сумма цифр под побочной диагональю $sum")
}
