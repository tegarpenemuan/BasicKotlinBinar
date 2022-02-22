package topik6

class Anak {
    //access modifier
    private val name: String = "Tegar"
    private val umur:Int = 21

    val pekerjaan:String = "Android Developer"

}

fun main() {
    val anak1 = Anak()
//    anak1.nama (tidak bisa diakses karena nama private)
    println(anak1.pekerjaan)
}