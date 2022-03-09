package topik2

fun main() {
    val vArray = Array(10) {
        1 * (it + 1)
    }

    for(i in vArray.indices) {
        println("Array index ke $i : ${vArray[i]}")
    }
}