package basics

class Shape(var height: Int, width:Int) {
    var perimeter = 2 * (height + width)
}
public fun main(){
    var rectangle = Shape(height = 5, width = 6)
    println("perimeter of rectangle os ${rectangle.perimeter}")
    println("Hello World")
    var a : Int = 10;
    var b = 20;
    var c = add(5, 6)
    println(c)
}
fun add(a : Int, b : Int): Int{
    return a + b;
}