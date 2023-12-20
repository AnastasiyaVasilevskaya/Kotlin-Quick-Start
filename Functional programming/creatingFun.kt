fun main(){
    val result = modifyString("Hello, Minsk!") { it.uppercase() }
    println(result)
}
fun modifyString(string: String, modify: (String) -> String):String{
    return modify(string)
}