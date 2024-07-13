fun main() {
    val fruits = listOf("apple", "banana", "cherry")
    println(fruits)
    val movies = mutableListOf(
        "runaway", "the summer i turned pretty", "monster"
    )
    movies.add("vikings")
    println(movies)
    data class Product(
        val title: String,
        val price: Double = 0.0,
        val brand: String = ""
    )

    val productList = listOf(
        Product("Samsung A51"),// if a variable is not passed in here in this case is called 0
        Product("hp 14s", 58000.00, "HP")
    )
    productList.forEach { // forEach is a HOF
        println(it.brand)
    }
}
