fun main(){
    val greeting : (String) -> Unit = {println("Hello, $it!")}
    greeting("Misha")
}