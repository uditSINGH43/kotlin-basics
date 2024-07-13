fun main() {
    val data = listOf(2, 3, 4, 5, 34, 35, 43, 42, 4, 23)
    println(data.filter { it % 2 != 0 })// filter helps in taking value specified by condition and only print the true ones
    println(data.map { it * it }) // map helps in taking every value from list and put it in condition
    val oddSqr = data.filter { it % 2 != 0 }.map { it * it } // it shows we can perform 2 operations simultaneously
    println("result: $oddSqr")

    fun isPositive(num: Int) = num > 0
    fun isNegative(num: Int) = num < 0

    fun myFilter(check: (num: Int) -> Boolean) {
        println("my filter called")
    }
    myFilter { isPositive(-6) }
}