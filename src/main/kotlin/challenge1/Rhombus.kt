fun main() {
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
    for (i in 8 - 1 downTo 1) {
        // Print space in increasing order
        for (j in 8 - 1 downTo i) {
            print(" ")
        }
        // Print star in decreasing order
        for (k in 1..i * 2 - 1) {
            print("*")
        }
        println()
    }
}
