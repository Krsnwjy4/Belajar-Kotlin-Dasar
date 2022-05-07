fun main() {
    var nilai = "A"
    when (nilai) {
        "A" -> {
            println("AMAZING")
        }
        "B" -> {
            println("GOOD")
        }
        "C" -> {
            println("NOT BAD")
        }
        "D" -> {
            println("BAD")
        }
        else -> {
            println("BAD ASS")
        }
    }

    when(nilai){
        "A", "B", "C", -> {
            println("Congratulation Dude")
        }
        else -> {
            println("You are fucking Bass")
        }
    }
    nilai ="A"
    val nilaiLulus: Array<String> = arrayOf("A", "B", "C")
    when (nilai) {
        in nilaiLulus -> println("You are the best")
        !in nilaiLulus -> println("FUCK OFF")
    }
    val name = "Krisna"
    when (name){
        is String -> println("$name Good Job")
        !is String -> println("Name is not String")
    }
    val nilaiUjian = 90
    when{
        nilaiUjian > 90 -> println("Amazing")
        nilaiUjian > 80 -> println("Good Job")
        nilaiUjian > 60 -> println("Not Bad")
        else -> println("TRY AGAIN")
    }
}