import kotlin.math.pow
fun power(num: Int, exp: Int = 2) = num.toDouble().pow(exp)
fun summer(a: Int, b:Int, c: Int) = a + b + c
fun main(){
    val ans  = summer (10, 20,20)
    println("answer",)
    println(ans)
    val ans2 = summer(20,12, 12)
    println("answer2")
    println(ans2)
    val ans3 = power(2,4)
    println(ans3)
    val ans4 = power(12)
    println(ans4)
}