fun main(args: Array<String>) {
    for (i in 1..8) {
        // Print space in decreasing order
        for (j in 8 downTo i + 1) {
            print(" ")
        }
        // Print star in increasing order
        for (k in 1..i * 2 - 1) {
            print("*")
        }
        println()
    }
}