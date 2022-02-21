package topik5

/**
 * Penjelasan mudahnya membuat template yang mereturn function
 * contoh:
 * jika inputan Int maka panggil function A
 *
 * Syarat input dan return antara template dan function yang diambil harus sama
 * */

fun printme(input: String) {
    println(input)
}

fun higherFunction(input:String, func: (String) -> Unit) {
    func(input)
}

fun main() {
    higherFunction("Kita mencetak",::printme)
}