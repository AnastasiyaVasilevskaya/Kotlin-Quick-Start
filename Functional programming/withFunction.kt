fun main(){
    val list = mutableListOf<Int>()
    for (i in 0 until 100){
        list.add((Math.random() * 100).toInt())
    }
    println(list)
    println("Сумма: ${list.sum()}")
    println("Первое число: ${list.first()}")
    println("Последнее число: ${list.last()}")
    println("Среднее арифметическое: ${list.average()}")
    println("Минимальное значение: ${list.min()}")
    println("Максимальное значение: ${list.max()}")

    //чтобы избежать бесконечного обращения к list, используем метод with()
    //можно обращаться к методам напрямую

    with(list){
        for (i in 0 until 10){
           add((Math.random() * 100).toInt())
        }
        println(this)
        println("Сумма: ${sum()}")
        println("Первое число: ${first()}")
        println("Последнее число: ${last()}")
        println("Среднее арифметическое: ${average()}")
        println("Минимальное значение: ${min()}")
        println("Максимальное значение: ${max()}")
    }

}