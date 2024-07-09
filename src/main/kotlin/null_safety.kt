fun main(){
    var a: Int? = 0
    a = null
    a = 50
    println(a)

    var name: String? = null
    println(name)
    name = readLine()
    name = null
    println(name)
    println(name?.length?: "no length available")
    println(name?.isBlank()?: "no data available")
        // ? nullability operator
        //?. null check or null safety operator
        //?: elvis operator
        // TODO: WILL UPDATE THIS THING

    }
