package basics

data class User(var name: String, val id : Int)

fun main() {
    val user = User("selvam", 1)
    val seconduser = User("selvam", 1)
    println(user)
    println(user.name)
    println(user==seconduser)
    println(user.hashCode())
    println(seconduser.hashCode())
}