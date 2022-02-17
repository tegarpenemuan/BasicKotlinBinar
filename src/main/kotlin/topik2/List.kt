/**Kapan penggunaan Array dan List
 *
 * Array jika data sudah jelas misal 23
 * List jika data belum jelas misal kasus covid
 * */

fun main() {
    var nameList: List<String> = listOf("Ka Rizky Fadilah", "Tegar", "Ali", "Ardi")
    var anotherList = listOf<String>()

    //Menampilkan data arraylist.. bedanya dengan array nama variabel list ketika diambil akan menampilkan semua datanya
    println(nameList)
    println(nameList[2]) //print data list with index

    //add data List
    var nilaiList: MutableList<Int> = mutableListOf(10, 5, 7, 9)
    println(nilaiList)
    nilaiList.add(3)
    println(nilaiList)
    nilaiList += 6
    println(nilaiList)

    //add data berdasarkan index yang kita inginkan
    nilaiList.add(0, 4)
    println(nilaiList)

    //add data berdasarkan index yang kita inginkan
    nilaiList[0] = 222
    println(nilaiList)

    //delete element atau value nya
    nilaiList.remove(4)
    println(nilaiList)

    //delete elemen dengan index
    nilaiList.removeAt(0)
    println(nilaiList)

    //menghitung jumlah elemen
    println(nilaiList.size)

    //untuk mencari elemen pada arary
    println(nilaiList.contains(6)) //jika ada return true jika tidak ada false

    //mengambil posisi index dari elemen
    println(nilaiList.indexOf(9))
    println(nilaiList.lastIndexOf(9))

    //menampilkan data pertama
    println(nilaiList.first())

    //menampilkan data terakhir
    println(nilaiList.last())

    //delete All
    nilaiList.removeAll(nilaiList) //opsi 1
    nilaiList.removeAll { true } // opsi 2
    nilaiList.clear() // opsi 3
    println(nilaiList)


}