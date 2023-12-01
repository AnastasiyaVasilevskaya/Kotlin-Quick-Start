package average

fun main(){
    val data = mapOf(
        "file1" to listOf(15,20,65,27,14),
        "file2" to listOf(17,20,64,28,14),
        "file3" to listOf(16,21,65,28,34)
    )
    val average = data.flatMap { it.value }.average()
    println(average)

}