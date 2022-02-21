package topik5

fun main() {

    //konversi kalkulator penjumlahan
    val penjumlahan = { a: Int, b: Int -> Int
        a + b
    }
    println(penjumlahan(6,3))

    //konversi kalkulator pembagian
    val pembagian = { a: Double, b: Double -> Double
        a / b
    }
    println(pembagian(6.0,3.0))

    //konversi bilangan Int to Double
    val dataInt = {a:Int -> Int
        a.toDouble()
    }
    println(dataInt(7))

    //Konversi bilangan
    val konversi_bilangan = { input:Int -> String
        when {
            input % 1000 == 0 -> "Ribuan"
            input % 100 == 0 -> "Ratusan"
            input % 10 == 0 -> "Puluhan"
            else -> "satuan"
        }
    }
    println(konversi_bilangan(50))

    //bilangan genap
    val bilanganGenap = { input:Int -> String
        when {
            input % 2 ==0 -> "Genap"
            else -> "Ganjil"
        }
    }
    println(bilanganGenap(51))

}