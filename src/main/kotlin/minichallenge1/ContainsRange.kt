/**
 * Number 3
 * */

object ContainsRange {
    fun containsRange(args: IntRange, args2: IntRange): Boolean {
        var bool = false
        for (i in args2) {
            if (i in args) {
                bool = true
            } else {
                bool = false
                break
            }
        }
        return bool
    }
}