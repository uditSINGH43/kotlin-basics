fun main() {
    println("enter a number: ")
    val num = readln().toInt()
    if (num % 2 == 0) {
        println("even")
    } else {
        println("odd")
    }
    println("who is father of chemistry: ")
    println("A: me")
    println("B: aristotle")
    println("C darwin")
    println("E: linnaeus")
    println("select an option: ")
    val ans = readln()
    when (ans) {
        "A" -> println("correct")
        "B" -> println("wrong")
        "C" -> println("wrong")
        "D" -> println("wrong")
        else -> println("invalid")
    }
    print(" question: what is your age")
    val age = readln().toInt()
    when {
        age < 0 -> println("invalid age")
        age < 10 -> println("go to mama")
        age in 18..60 -> println("adult")
        else -> println("you are senior")

    }
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    if ((a > b) and (a > c))
        println("A is greater")
    else if ((b > a) && (b > c)) {
        println("B is greater")

    } else {
        println("C is greater")
    }
}

