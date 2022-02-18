package topik4

/**
 *Aku punya uang sebesar 500_000
 *AKu ke Mall -> belanja dan melihat barang whislist
 *Dari 500_000 aku membeli:
 * 1. Tas 200_000
 * 2. Buku 50_000
 * 3. Baju 100_000
 * 4. celana 80_000
 * 5. Parkir 15_000
 * */

/**
 * Dari uang 500_000
 * cluenya adalah dengan menggunakan condition
 *
 * Barang yang dibeli tidak boleh lebih dari 1
 * */


class Exercise(private val uang: Int) {
    //val uang = 500_000 //membeli tas
    //val uang = 90_000 //membeli buku
    //val uang = 120_000 //membeli tas

    private val tas: Int = 200_000
    private val baju: Int = 100_000
    private val celana: Int = 80_000
    private val buku: Int = 50_000
    private val parkir: Int = 15_000

    private var sisa: Int? = null

    fun beli() {
        if (uang >= 200_000) {
            println("Aku membeli barang: Tas seharga $tas")
            println("Sisa Uang tinggal "+ (uang-tas)) //300_000
            sisa = uang - tas
            if(sisa!! >= 100_000) {
                println("Aku membeli barang: Buku seharga $baju")
                println("Sisa Uang tinggal "+ (uang-baju)) //300_000
            }


        } else if (uang >= 50_000) {
            println("Aku membeli barang: Buku seharga $buku")
        } else if (uang >= 100_000) {
            println("Aku membeli barang: Baju seharga $baju")
        } else if (uang >= 80_000) {
            println("Aku membeli barang: Celana seharga $celana")
        } else if (uang >= 15_000) {
            println("Aku membayar parkir seharga $parkir")
        } else {
            println("Tidak ada pilihan")
        }
    }
}


fun main() {
    val ex = Exercise(500_000)
    println(ex.beli())
}