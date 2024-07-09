class Person(
    val name: String,
    var age: Int,
    var maritalstatus: String,
    val gender: String,
    val race: String = "Indian"
){
    fun show(){
        println("$name is $age years old")
        println("he is $race and his gender is $gender")
        println("he belongs to $race and is currently $maritalstatus")
    }
}
fun main(){
    val p1 = Person(name = "Udit", age = 21, gender = "M", race = "South Asian", maritalstatus = "committed")
    val p2 = Person(name = "Shanvi", age = 21, gender = "F", race = "South Asian", maritalstatus = "committed")
    p1.show()
    p2.show()
}