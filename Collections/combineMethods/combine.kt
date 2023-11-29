package combineMethods
fun main(){
    val listOfNumbers = mutableListOf<Int>()
    for(i in 0 until 1000){
        listOfNumbers.add((Math.random() * 1000).toInt())
    }
    val newList = listOfNumbers.filter { it % 5 == 0 || it % 3 == 0 }.map{it *  it}.sortedDescending().map{"$it "}


    for(i in newList){
        println(i)
    }
}
