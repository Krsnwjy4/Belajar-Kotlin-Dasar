fun fullName(
    firstName: String,
    middleName: String,
    lastName: String
){
    println("Hello $firstName $middleName $lastName")
}

fun main() {
    fullName("Wahyu", "Krisna", "Wijaya")
    fullName(
        lastName = "Wijaya",
        firstName = "Wahyu",
        middleName = "Krisna"
    )
}