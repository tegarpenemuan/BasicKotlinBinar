package topik4

/**Learn Constructor atau mirip seperti parameter
 *
 *
 * */


//Primary Constructor
class Komputer(
    val brand:String,
    val ram: Int,
    val storage: Int,
    val graphic: String
) {

}

//Secondary Constructor

fun main() {
    val pcGaming = Komputer("Lenovo",8,500,"VGA")
    println(pcGaming.brand)
}