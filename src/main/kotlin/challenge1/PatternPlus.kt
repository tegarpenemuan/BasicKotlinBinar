fun main() {
    for (i in 1 until 8 * 2) {
        if (i == 8) {
            // Printing Horizontal Line of Stars
            for (j in 1 until 8 * 2) {
                print("*")
            }
        } else {
            // Printing space before Vertical Line of Stars
            for (k in 1 until 8) {
                print(" ")
            }
            print("*")
        }
        println()
    }
}