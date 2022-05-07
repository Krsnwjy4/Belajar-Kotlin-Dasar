fun String.hello(): String = "Hello $this"

fun String.printHello(): Unit = println("Hello $this")

fun main() {

    val name = "Krisna"
    println(name.hello())

    name.printHello()

    "Wijaya".printHello()

}