package topik3

fun main() {
    rangeDot()
}

fun rangeDot() {
    val mRange = 0..10 step 2
    println(mRange.count())

    val rangeTo = 0.rangeTo(10) step(2)
    println(rangeTo.count())
}