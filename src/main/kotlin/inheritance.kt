open class Human(
    open val name: String,
    open val age: Int,
    open val gender: String = "M"
){ init {
    println("new day new code")
}
    open fun detail(){
        println("i am $name")
        println("i am $age years old")
        println(" i identify as a $gender")
        when (gender) {
            "M" -> println("I Am Male")
            "F" -> println("I Am Female")
        }
    }
}


class Student(
    override val name: String,
    override val age: Int,
    override val gender: String,
    val school: String,
    val klass: String
): Human(name, age, gender){ init {
    println("it take values from superclass by using //open// then use//override// to take value from superclass  ")
}
    override fun detail(){
        super.detail()
        println("i study in $school")
        println("i am in $klass class")
    }
}
fun main(){
    val h1 = Human("ravi",24)
    val h2 = Student("tanuja", 20, "F","KV", "12th")
    h1.detail()
    println("----")
    h2.detail()
}
