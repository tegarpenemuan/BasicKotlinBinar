fun main(args: Array<String>) {
    for (i in 8 downTo 1) {
        // Print star in decreasing order
        for (k in 1..i * 2 - 1) {
            print("*")
        }
        println()
        // Print space in increasing order
        for (j in 8 downTo i) {
            print(" ")
        }
    }
}