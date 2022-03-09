import java.util.*

fun main() {
/**Array data bisa berubah namun struktur tidak*/

    //Cara mendefinisikan array
    var nameArray: Array<String> = arrayOf("Ka Rizky Fadilah", "Tegar", "Ali", "Ardi")

    //Menampilkan Data Array
    println(nameArray[3])
    println(nameArray.get(3))

    //Menambahkan Data Array/ Mereplace
    nameArray = arrayOf("Arya","Dena","Stevani","ucup","lili")
    println(nameArray.size)

    var numberArray: Array<Int> = arrayOf(1,2,3)
    var numberDesimal: Array<Float> = arrayOf(1.8f, 2.6f)

    //tampilkan semua data dengan for
    for (element in nameArray) {
        println(element)
    }

    //tampilkan semua data dengan foreach
    nameArray.forEach {
        println(it)
    }

    //tampilkan data dengan toString
    println(nameArray.contentToString())
}