package filter

fun main() {
    val names = listOf<String>("Андрей", "Маша", "Олег", "Артем")
    val listOfANames = names.filter{ it.startsWith("А")}
    for(i in listOfANames){
        println(i)
    }
}