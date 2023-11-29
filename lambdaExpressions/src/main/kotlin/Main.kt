fun main() {
    val perimeter : (Int, Int) -> Int = {a, b -> (a+b) * 2}
    println(perimeter(20, 15))
}