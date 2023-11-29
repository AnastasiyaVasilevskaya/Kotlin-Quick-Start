fun main(){
    val sort : (Array<Int>) -> Array<Int> ={
        for (i in it.size - 2 downTo 0){
            for (j in 0 .. i){
                if (it[j] < it[j+1]){
                    val temp = it[j]
                    it[j] = it[j+1]
                    it[j+1] = temp
                }
            }
        }
        it
    }
    val sortedArray = sort(arrayOf(45, 0, -8, 5, -1, 4, 7))
    for (i in sortedArray){
        print("$i ")
    }
}