//inline fun hello(name: () -> String): String {
//    return "Hello ${name()}"
//
//}
//
//fun main() {
//    for (i in 0..100){
//        println({"krina"})
//    }
//
//}

inline fun hello(
    firstName: () -> String,
    noinline lastName:() ->String
): String {
    return "Hello ${firstName()} ${lastName()}"

}

fun main() {
    for (i in 0..100){
        println(hello({"krisna"}, {"wijaya"}))

    }

}
