// best example of implement will be present in view model
sealed class Error(val message: String) {
    class NetworkError : Error("network failure")
    class DatabaseError : Error("Database error")
    class UnknownError : Error("Unknown Error Occurred")
}

fun main(){
    val ne = Error.NetworkError()
    val ue = Error.UnknownError()

    println (ne.message)
    println (ue.message)
}