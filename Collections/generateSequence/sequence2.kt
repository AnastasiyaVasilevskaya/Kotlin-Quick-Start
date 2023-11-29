package generateSequence

fun main(){
    val array = generateSequence(1, {it + 1})
    val employeesList = array.map{"Employee № $it"}.take(100)
    for (empl in employeesList){
        println(empl)
    }
} 