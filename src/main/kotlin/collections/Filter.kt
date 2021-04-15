package collections

class Filter {
}
val l = listOf(1, 2, 3, -3, -4, -7)
val l1 = listOf<String>("Sandy", "Shivangi", "Ashwin", "Mani", "Sakthi", "Pugazh",)
fun main() {
    println("First no. "+l1.first())
    println("Last no. "+ l1.last())
    println("First name starts with s : " + l1.find { it.startsWith("S") })
    println("Last name starts with s : " + l1.findLast { it.startsWith("S") })
    println("First even No. " + l.first { it % 2 == 0 })
    println("Last even No. " + l.last { it % 2 == 0 })
    println(l.filter { it > 0 })
    println("Doubles : "+l.map { s -> s*2 })
    println("Any of the elements greater than 2 : "+l.any { it > 2 })
    println("Are all the elements greater than 0 : "+l.all { it > 0 })
    println("Are none of elements greater than 1 : "+l.none { it > 1 })
}