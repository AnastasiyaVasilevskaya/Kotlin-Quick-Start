package average

fun main(){
    val revenueByWeek = listOf(
        listOf(4,8,4,7,6,1),
        listOf(5,9,4,3,6,1),
        listOf(1,8,4,2,6,5),
        listOf(9,8,4,7,8,1)
    )
//    val total = mutableListOf<Int>()
//    revenueByWeek.map{
//        for (i in it){
//            total.add(i)
//        }
//    }
//    длинное решение

    val total = revenueByWeek.flatten()
    var average = total.average()
    println(average)
}