package topik3

fun main() {

    val participant = 24

    if (participant >= 20) {
        println("Kelas akan dimulai sekarang")
    } else {
        println("Kelas belum akan dimulai jika belum berjumlah 20 orang")
    }

    val sakit = false
    if (sakit) {
        println("Tidak wajib mengikuti kelas")
    } else {
        println("wajib mengikuti kelas")
    }

//    gojek = 25000, mobil = 400000
//    trans jakarta 15000
//    angkot = 5000
//    jalan kaki = sehat
    val uang = 55000
    if(uang >= 25000) {
        if(uang >= 40000) {
            println("Naik Mobil Gojek")
        } else {
            println("Naik Gojek")
        }
    } else if(uang >= 15000) {
        println("Naik Trans Jakarta")
    }  else if(uang >= 5000) {
        println("Naik Angkot")
    }  else {
        println("Jalan Kaki")
    }

}