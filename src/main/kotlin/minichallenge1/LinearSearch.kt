/**
 * Number 5
 * */
object LinearSearch {
//    fun getIndex(input: List<Any>, key: Any): Int {
//        for ((index, value) in input.withIndex()) {
//            if (value == key) {
//                return index
//            }
//        }
//        return -1
//    }

    fun getIndex(input: List<Any>, key: Any): Int {
        return input.indexOf(key)
    }

}


object OddNumbers {
    fun oddCount(n: Int): Int {

        // create a variable to hold out count
        var count = 0

        // loop from 1 to the value of `n`
        for (i in 1 until n) {
            // increment count if i divided by 2 has a remainder
            if (i % 2 != 0) count++
        }

        // return out count
        return count
    }
}
