fun main() {
    var nilaiUjian = 80
    var nilaiAbsen = 80

    var nilaiExtra = 70

    val apakahlulusUjian = nilaiUjian > 75
    val apakahlulusAbsen = nilaiAbsen > 75

    val apakahlulusExtra = nilaiExtra > 75

    val apakahLulus = apakahlulusUjian && apakahlulusAbsen && apakahlulusExtra
    // val apakahLulus = (apakahlulusUjian && apakahlulusAbsen) && apakahlulusExtra
    // val apakahLulus = ((apakahlulusUjian && apakahlulusAbsen) && apakahlulusExtra)
    println(apakahLulus)
}