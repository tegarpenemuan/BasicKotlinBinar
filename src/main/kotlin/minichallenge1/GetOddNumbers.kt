/**
 * Number 2
 * */

object GetOddNumbers {
    fun getOdd(input: List<Int>) {
        val oddArray = input.filter{ it % 2 != 0 }
        println(oddArray.joinToString())
    }
}