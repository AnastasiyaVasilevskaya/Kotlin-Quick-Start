package map
fun main(){
    val numbers = (0 .. 100).toList()
    val doubledNumbers = numbers.map{it * 2}
    for (i in doubledNumbers){
        println(i)
    }
}
