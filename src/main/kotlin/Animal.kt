open class Animal(
    group: String? = null
){
    fun eat(){
        println("animal eat")
    }
    fun sleep(){
        println("animal sleep")
    }
}

class Monkey : Animal(group = "mammal"){
    fun jump(){
        println("monkey can jump")
        }
    }


class Crocodile : Animal(group = "reptile"){
    fun swamp(){
        println("crocodile lives in swamp")
    }
}
fun main(){
    val o1 = Monkey()
    val o2 = Crocodile()
    o1.eat()
    o2.sleep()
    o2.eat()
}