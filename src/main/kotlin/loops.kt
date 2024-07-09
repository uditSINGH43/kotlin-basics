fun main(){
    val movies = listOf("kalki2898 ad", "gadar", "avengers")
    for (name in movies) {
        println("i❤️ $name")
    }
    for (idx in movies.indices){
        println("$idx ${movies[idx]}")
        }
    for (i in 1..10){
        println("$i good")
    }
    // ranges
    for (x in 9 downTo 0 step 2){
        print(x)
    }
    // sum of all digits
    val number = 1223234
    var temp = number
    var total = 0
    while(temp > 0){
        println("$temp => $total")
        total += temp%10
        temp /= 10

    }
    println("total of $number is $total")

    // about me broski
    var aboutme = " "
    do{
        print(">>>")
        val line = readln()
        aboutme += line + "\n"
    }while (line.isNotBlank())
    println("about me\n$aboutme")

}