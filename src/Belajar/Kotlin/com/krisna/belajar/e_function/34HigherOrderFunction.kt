fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name)
        return "Hello $nameTransform"

    }
    val lambdaUpper = {value: String -> value.toUpperCase()}
    println(hello("krisna", lambdaUpper))

    println(hello("krisna", {value: String -> value.toLowerCase() }))

    val result1 = hello("krisna", {value: String -> value.toString() })
    val result2 = hello("krisna") {value: String ->
        value.toLowerCase()
    }
}