fun main(){
    val data = mapOf(
        "Январь" to listOf(200,100,400,300),
        "Февраль" to listOf(200,200,-190,200),
        "Март" to listOf(300,180,300,100),
        "Апрель" to listOf(250,-250,100,300),
        "Май" to listOf(200,100,400,300),
        "Июнь" to listOf(200,100,300,300)
    )
    printInfo(data)
}
fun printInfo(data: Map<String, List<Int>>){
    val total = data.filter{ it.value.all() {it >= 0 } }
    val averageInWeek = total.flatMap { it.value }.average()

    val sumMonth = total.map{ it.value.sum() }
    val averageInMonth = sumMonth.average()

    val maxInMonth = sumMonth.max()

    val maxMonth = total.filter { it.value.sum() == maxInMonth }.keys

    val minInMonth = sumMonth.min()

    val minMonth = total.filter { it.value.sum() == minInMonth }.keys

    println("Средняя выручка в неделю: $averageInWeek")
    println("Средняя выручка в месяц: $averageInMonth")
    print("Максимальная выручка в месяц: $maxInMonth")
    print("\nБыла в следующих месяцах: ")
    for(m in maxMonth){
        print("$m ")
    }
    print("\nМинимальная выручка в месяц: $minInMonth")
    print("\nБыла в следующих месяцах: ")
    for(m in minMonth){
        print("$m")
    }

    val invalidTotal = data.filter{it.value.any() {it < 0 }}.keys
    print("\nОшибки произошли в следующих месяцах: ")
    for(m in invalidTotal){
        print("$m ")
    }





}