package topik6

open class Parents {
    open val tabungan:Long = 5_000_000L
    open fun diabetes() {

    }

    open fun colesterol() {

    }

    open fun darahTinggi() {

    }
}

class Childs:Parents() {
    override val tabungan:Long
        get() = super.tabungan


    override fun diabetes() {
        super.diabetes()
    }

    override fun colesterol() {
        super.colesterol()
    }
}

fun main() {
    val child = Childs()
    println(child.tabungan)
}