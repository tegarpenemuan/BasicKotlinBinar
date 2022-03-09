fun main() {
    // Print i number of stars
    for (i in 1..15 * 2 - 1) {
        for (j in 1..15) {
            if (j == i || j == 15 - i + 1) {
                print("*")
            }
            print(" ")
        }
        println()
    }
}
