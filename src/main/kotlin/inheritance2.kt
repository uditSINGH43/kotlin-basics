//interfaces
interface Vehicle{
    fun start() // declare method
    fun stop()  // declare method
}

class Car(): Vehicle{
    override fun start() {
        println("car is start")
    }

    override fun stop() {
        println("car is stop")
    }
}


class Truck(): Vehicle{
    override fun start() {
        println("truck is starting")

    }

    override fun stop() {
        println("truck is stop")
    }
}

abstract class Smartphone{
    open fun takePictures(){
        println("function to take picture")
    }
    fun takeCall(){
        println("function to take calls")
    }

}
class Iphone: Smartphone(){
    override fun takePictures() {
        println("function to take picture with iphone")
    }
}

fun main() {
    val i1 = Iphone()
    val c1 = Car()
    val t1 = Truck()
    c1.start()
    t1.start()
    c1.stop()
    t1.stop()
}