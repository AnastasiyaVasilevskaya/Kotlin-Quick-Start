package sorted
fun main(){
    val array = arrayOf(1,-89,4,7,-405,12,18)
    val sortedArray = array.sorted()
    val sortedArrayDesc = array.sortedDescending()
    for (i in sortedArray){
        print("$i ")
    }
    println()
    for (i in sortedArrayDesc){
        print("$i ")
    }

}