package map
fun main(){
    val numbers = (1 .. 50).toList()
    val employees = numbers.map {"Employee № $it "}
    for (empl in employees){
        println(empl)
    }

}