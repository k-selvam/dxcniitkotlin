package basics

class Strings {
}
fun main() {
    var a = 1;
    var name = "selvam $a";
    var age = 21;
    var sentence = "${name.replace(oldValue = "selvam", newValue = "K Selvam")}"
    println(sentence)
    println(maxofNumbers(520, 60))
    println(minofNumbers(20, 30))
    val items = listOf("selvam", "subash", "rahul", "vicky", "sundar")
    var index = 0;
    while (index < items.size) {
        println("${items[index]} is at $index")
        index++
    }
}
fun maxofNumbers(a : Int, b : Int):Int {
    if(a > b) return a
    else return b
}
fun minofNumbers(a : Int, b : Int):Int {
    if(a < b) return a
    else return b
}
