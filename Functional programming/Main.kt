fun main() {
    val list = (0..100).toList()
    printSum(list){
        println(it.sum())
    }
}
inline fun printSum(list: List<Int>, operator: (List<Int>) -> Unit) {
    operator(list)
}