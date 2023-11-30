package zip
fun main(){
    val names = mutableListOf<String>()
    val phoneNumbers = mutableListOf<Long>()

    for (i in 1 .. 100){
        names.add("Name$i")
    }
    for (i in 1 .. 50){
        phoneNumbers.add(375_29_000_00_00 + (Math.random() * 1_000_00_00).toLong())
    }
    for (i in 51 .. 100){
        phoneNumbers.add(375_44_000_00_00 + (Math.random() * 1_000_00_00).toLong())
    }

    val users = names.zip(phoneNumbers)
    for (users in users){
        println("Name: ${users.first}  Number Phone: ${users.second}")
    }
}