package drop
fun main(){
    val array = (1..40).toList()
    val employees = array.map{"Employee №$it"}
    val delfirst30 = employees.drop(10)
    val dellast30 = employees.dropLast(10)
    for (empl in delfirst30){
        println(empl)
    }
    println()
    for (empl in dellast30){
        println(empl)
    }

}