package topik3

fun main() {
    val uang = 2000
    if(uang >= 25000) {
        if(uang >= 40000) {
            println("Naik Mobil Gojek")
        } else {
            println("Naik Gojek")
        }
    } else if(uang >= 15000) {
        println("Naik Trans Jakarta")
    }  else if(uang >= 5000 && uang >= 0) {
        println("Naik Angkot")
    }  else {
        println("Jalan Kaki")
    }
}