package functions

class Order {
}
fun String.isMale(name : String) : Boolean{
    if(name.startsWith("a"))return true
    else return false
}
fun main() {
    println(String().isMale("azad"))
}