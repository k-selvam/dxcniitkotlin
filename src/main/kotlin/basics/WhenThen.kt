package basics

class WhenThen {
}
fun main() {
    println(describe("Hello"))
    println(describe(1))
    print("hello")
}
fun describe(obj : Any):String{
    return when(obj){
        1 -> "one"
        "Hello" -> "greetings"
        is Long -> "long no"
        !is String -> "It is not string"
        else -> "unknown"
    }
}