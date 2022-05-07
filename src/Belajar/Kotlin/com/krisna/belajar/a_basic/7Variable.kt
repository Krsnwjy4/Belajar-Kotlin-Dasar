const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {
    var firstName: String = "Krisna"
    var lastName = "Wijaya"
    println(firstName)
    println(lastName)

    val firstName2 = "KRISNA"
    val age = 31
    val tahun = "Thn"
    println(firstName2)
    print(age)
    println(tahun)

    var username: String? = null
    username = "Krsnwjya"
    println(username)
    println(username?.length)

    println("$APPLICATION : $VERSION")
    
}