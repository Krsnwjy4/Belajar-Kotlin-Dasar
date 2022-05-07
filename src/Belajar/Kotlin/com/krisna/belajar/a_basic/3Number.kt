fun main() {
//  Integer Number
    var age: Byte = 10
    var height: Int = 100
    var distance: Short = 1000
    var balance: Long = 10000L

    println(age)
    println(height)
    println(distance)
    println(balance)

//  Floating Point Number
    var value: Float = 10.00F
    var radius: Double = 100.000

    println(value)
    println(radius)

//  Literals
    var decimalLiteral: Int = 100
    var hexadecimalLiteral: Int = 0xFF
    var binary: Int = 0b001010101

    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binary)

//  Underscore in Number
    var ageUnderscore: Byte = 1_0
    var heightUnderscore: Int = 1_0_0
    var distanceUnderscore: Short = 1_000
    var balanceUnderscore: Long = 10_000_000L

    println(ageUnderscore)
    println(heightUnderscore)
    println(distanceUnderscore)
    println(balanceUnderscore)

//  Conversion
    var balanceInt: Int = balance.toInt()
    println(balanceInt)

    var doubleBinary: Double = binary.toDouble()
    println(doubleBinary)
}