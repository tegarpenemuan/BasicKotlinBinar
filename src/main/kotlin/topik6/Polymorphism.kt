package topik6

open class BangunDatar {
    open fun luas() {

    }

    open fun keliling() {

    }
}

class persegi() : BangunDatar() {
    val sisi: Int = 0

    override fun luas() {
        sisi * sisi
    }

    override fun keliling() {
        2 * sisi * sisi
    }
}