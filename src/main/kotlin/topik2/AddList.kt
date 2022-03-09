package topik2

fun main() {
    val mList = mutableListOf(1,'x',false,"Binarian")
    println("mList 1: $mList")

    mList.add("Vijay")
    println("mList 1: $mList")
    mList += "Krisna"
    println("mList 1: $mList")

    println(mList.contains("Binar"))
}
