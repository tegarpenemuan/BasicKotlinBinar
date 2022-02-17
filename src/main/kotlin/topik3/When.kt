package topik3

fun main() {
    rangeUang()
//    uangMe()
//    surveiSlur()
//    math()
}

fun surveiSlur() {
    val survei = 10
    when (survei) {
        5 -> println("Sangat Bagus")
        4 -> println("Bagus")
        3 -> println("Normal")
        2 -> println("Kurang")
        1 -> println("bad")
        else -> println("tidak ada pilihan")
    }
}

fun math() {
    val a = 12
    val b = 5

    println("Enter operator either +, -, * or /")
    val operator = readLine()

    val result = when (operator) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> a / b
        else -> "$operator operator is invalid operator."
    }

    println("result = $result")
}

fun uangMe() {
    val uang = 400
    when {
        uang >= 40000 -> println("Naik Mobil Gojek")
        uang >= 25000 -> println("Naik Gojek")
        uang >= 15000 -> println("Naik Trans Jakarta")
        uang >= 5000 -> println("Naik Mobil Angkot")
        else -> println("Jalan Kaki")
    }
}

fun rangeUang() {
    val uang = 15000
    when (uang) {
        in 0..5000 -> println("Naik Mobil Gojek")
        in 15000..25000 -> println("Naik Gojek")
        in 5000..15000 -> println("Naik Trans Jakarta")
        else -> println("Jalan Kaki")
    }
}