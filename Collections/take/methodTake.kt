package take

fun main(){
    val array = (1..100).toList()
    val employees = array.map{"Employee №$it"}
    val first30 = employees.take(30)
    val last30 = employees.takeLast(30)
    for (empl in first30){
        println(empl)
    }
    println()
    for (empl in last30){
        println(empl)
    }

}