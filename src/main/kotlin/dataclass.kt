data class Actor(
    val name: String,
    val gender: String = "M"
)

data class Message(
    val dp:String,
    val name: String,
    val last_msg: String,
    val time: String,
    val status: String,
    val isNotification: Boolean
)


fun main(){
    val actor = Actor("Tom Cruise")
    val actor2 = Actor("Megan Fox", "♀️")
    val msg = Message("maharaj","udit singh", "maharaj ki jai ho", "15:34", "doube click",false)
    println(actor)
    println(actor2)
}