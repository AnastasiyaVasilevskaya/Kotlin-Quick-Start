package zip
fun main(){
    val array: Array<String> = arrayOf("Пупкин Вася", "Сосновская Мария", "Русских Дмитрий", "Милешко Полина")
    val lastNames = array.map {it.substringBefore(" ")}
    val names = array.map {it.substringAfter(" ")}
    val users = lastNames.zip(names)
    for (user in users){
        println("Фамилия: ${user.first}  Имя: ${user.second}")
    }
    println()
    //решение с помощью объекта, без разбиения на два массива
    val array2: Array<String> = arrayOf("Василевская Анастасия", "Качановская Мария", "Колдун Дмитрий", "Бузова Ольга")
    val users2 = array2.map{ Pair(it.substringBefore(" "), it.substringAfter(" "))}
    for (user in users2){
        println("Фамилия: ${user.first}  Имя: ${user.second}")
    }
}