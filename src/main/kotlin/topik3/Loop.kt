package topik3

fun main() {
//    lfor()
    name()
}

fun lfor() {
    for (i in 0..10 step 2) {
        print(i)
    }
}

fun name() {
    val nameList: List<String> = listOf("Ka Rizky Fadilah", "Tegar", "Ali", "Ardi")

//    for (element in nameList) {
//        println(element)
//    }

    nameList.forEach {
        println(it)
    }
}

