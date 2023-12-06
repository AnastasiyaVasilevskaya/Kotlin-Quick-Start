var name: String? = null
fun main() {
    name?.let {
        if(it.length > 5){
            println("Длина name больше 5.")
        }
    }
}