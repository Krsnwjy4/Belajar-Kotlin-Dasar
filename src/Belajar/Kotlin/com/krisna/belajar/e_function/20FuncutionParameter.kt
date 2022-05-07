fun sayHello(firstName: String, lastName: String?){
    if (lastName == null){
        println("Hello $firstName")
    } else {
        println("Hello $firstName $lastName")
    }
}
fun main() {
    sayHello("Wahyu", "Krisna")
    sayHello("Krisna", null)
    sayHello("Wijaya", "Kusuma")
}