val numberList: MutableList<Int>? = null // or = mutableListOf()
fun main(){
    numberList?.let {
        with(numberList){
            for(i in 1 until 500){
                add((Math.random() * 500).toInt())
            }
            val result = filter{it % 2 == 0}.take(100)
            for (i in result){
                println(i)
            }
        }
    }
}