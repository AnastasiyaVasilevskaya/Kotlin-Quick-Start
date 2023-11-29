package generateSequence

fun main(){
    val array = generateSequence(0, {it + 2})
    val evenList = array.take(10)
    for (i in evenList){
        println(i)
    }
}