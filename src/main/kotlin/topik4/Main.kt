package topik4

fun main() {
    val mns = Manusia(_name = "Ucup", _tinggiBadan = 170)
    println(mns.eat())
    println("Nama : ${mns.nama}")
    println("Tinggi Badan : ${mns.tinggiBadan}")
    println("==============================")

    mns.nama = "Tegar Maulana"
    println("Nama : ${mns.nama}")
    mns.mencariMakan()
    println("==============================")

}

class Manusia {
    var nama: String = "Tegar Penemuan"
    var kelamin: String = "Pria"
    var tinggiBadan: Int = 170
    var beratBadan: Int = 60
    fun eat() = "Butuh Makan"
    fun mencariMakan() {
        return println("Mencari makan di warmindo")
    }

    constructor(_name:String, _tinggiBadan:Int) {
        this.nama = _name
        this.tinggiBadan = _tinggiBadan
    }

}



