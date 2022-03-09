/**
 * Number 6
 * */

object CountDown {
    fun countDown(input: Int): List<Int> {
        val range = input downTo 0
        val list = mutableListOf<Int>()
        range.forEach {
            list.add(it)
        }
        return list
    }
}