fun main() {
    var firstName: String = "Krisna"
    var lastName: String = "Wijaya"

    var quote: String = """
        >HARTA
        >TAHTA
        >SUKA CITA
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(quote)

    var fullName: String = firstName+" "+lastName
    println(fullName)

    var fullName2: String = "$firstName $lastName"
    println(fullName2)

    var desc: String = "$fullName2 lenght = ${fullName2.length}"
    println(desc)
}