fun main() {
    val a: Int=45
    val b: Int=55

    println(sum(a,b))
    println(average(a,b))
}
fun sum(a: Int,b: Int):Int {
    return a+b
}
fun average(a: Int,b: Int):Int{
    return (a+b)/2
}