package collections

class Map {
}
val PassedStudents : MutableMap<Int, String> = mutableMapOf()

fun main() {
    PassedStudents.put(1, "Selvam")
    PassedStudents.put(2, "azad")
    println(PassedStudents)
    println(PassedStudents.keys)
    println(PassedStudents.filter { x -> x.value.startsWith("a") })
}