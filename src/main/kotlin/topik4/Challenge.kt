package topik4

class Barang (
    val nama:String,
    val harga:Int
)

fun main() {
    val tas = Barang(nama="Tas", harga=200_000)
    val buku = Barang(nama="Buku", harga=50_000)
    val baju = Barang(nama="Baju", harga=100_000)
    val celana = Barang(nama="Celana", harga=80_000)
    val parkir = Barang(nama="Parkir", harga=15_000)

    var cart:MutableList<Barang> = mutableListOf()
    var uang: Int = 500_000

    while(uang > 0) {
        when {
            !cart.contains(tas) -> {
                cart.add(tas)
                if(uang < tas.harga) {
                    continue
                }
                uang-=tas.harga
                println("Aku membeli barang: ${tas.nama} seharga ${tas.harga}")
            }
            !cart.contains(buku) -> {
                cart.add(buku)
                if(uang < buku.harga) {
                    continue
                }
                uang-=buku.harga
                println("Aku membeli barang: ${buku.nama} seharga ${buku.harga}")
            }
            !cart.contains(baju) -> {
                cart.add(baju)
                if(uang < baju.harga) {
                    continue
                }
                uang-=baju.harga
                println("Aku membeli barang: ${baju.nama} seharga ${baju.harga}")
            }
            !cart.contains(celana) -> {
                cart.add(celana)
                if(uang < celana.harga) {
                    continue
                }
                uang-=celana.harga
                println("Aku membeli barang: ${celana.nama} seharga ${celana.harga}")
            }
            !cart.contains(parkir) -> {
                cart.add(parkir)
                if(uang < parkir.harga) {
                    continue
                }
                uang-=parkir.harga
                println("Aku membeli barang: ${parkir.nama} seharga ${parkir.harga}")
            }
            else -> {
                break
            }
        }
    }
}
