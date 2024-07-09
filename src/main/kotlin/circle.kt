class Circle(
    val radius: Int
){
    init {// it is keyword which is used to run code for initial settings of code directly after run command after which later work is done
        println("this code is for circle creation")
    }
    fun circumference() = 2 * Math.PI * radius
    fun area() = Math.PI * radius * radius
}
fun main(){
    print("enter radius of circle = ")
    val r = readln().toInt()
    val c1 = Circle(r)
    println("circle with radius ${c1.radius}")
    println("Area will be ${c1.area()}")
    println("circumference will be ${c1.circumference()}")
}