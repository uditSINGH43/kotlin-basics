fun main() {
    val items = listOf(2, 3, 5, 6, 2, 3, 5)
    val total = items.fold(0) { acc, x -> acc + x }
    val max = items.fold(items.first()) { acc, x -> if (x > acc) x else acc }
    println("the greatest number in the list is $max")
    println("total of $items is $total")

    val mTotal = items.fold(1) { a, i -> a * i }
    println("$mTotal")
}