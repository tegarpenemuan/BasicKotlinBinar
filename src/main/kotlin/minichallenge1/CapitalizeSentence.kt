/**
 * Number 1
 * */

object CapitalizeSentence {
    fun capitalizeSentence(word: String) {
        val words = word.split(" ").toMutableList()
        var output = ""

        for (word in words) {
            output += word.capitalize() + " "
        }
        output = output.trim()
        println(output)
    }
}
