package collections

class Filter {
}
val l = listOf(1, 2, 3, -3, -4, -7)
fun main() {
    println(l.filter { it > 0 })
}