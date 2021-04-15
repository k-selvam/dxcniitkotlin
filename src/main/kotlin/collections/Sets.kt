package collections

class Sets {
}
val a : MutableSet<String> = mutableSetOf("one", "two", "three", "four")
fun addelements(x : String) : Boolean{
    if(a.add(x)){
        println("Element added successfully")
        return true
    }
    else{
        println("Element already exists")
        return false
    }
}

fun main() {
println(a)
    println(addelements("five"))
    println(a)
    println(addelements("one"))
    println(a)

}