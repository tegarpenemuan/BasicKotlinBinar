fun main() {
    var n1 = 0
    var n2 = 1
    var n3: Int
    var i: Int = 2
    val count = 12

    print("$n1 $n2")
    while (i < count) {
        n3 = n1 + n2
        print(" $n3")
        n1 = n2
        n2 = n3
        ++i
    }

}
