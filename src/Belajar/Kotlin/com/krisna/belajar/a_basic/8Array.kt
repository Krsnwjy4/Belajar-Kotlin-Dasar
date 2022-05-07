fun main() {
    val names: Array<String> = arrayOf("Wahyu","Krisna","Wijaya")
    // names.set(0,"Stone")
    names[0] = "Rena"
    println(names[0])
    println(names[1])
    println(names[2])

    val nilai: Array<Int> = arrayOf(23,6,90)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Wahyu"
    members[1] = "Krisna"
    members[2] = "Wijaya"
    members[3] = "Eric"
    members[4] = "Ova"

    println(members[1])
}