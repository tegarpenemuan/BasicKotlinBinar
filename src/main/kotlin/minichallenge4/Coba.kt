///* From "Kotlin List API - Part 1: List Filtering"
// * https://bit.ly/2XUcyLP
// */
////data class Person(val name:String, val age:Int)
//
//fun main() {
//    val people = listOf(
//        Person("Zander", 78),
//        Person("Fred", 12),
//        Person("Ali", 35)
//    )
//
//    val result_1 = overTwenty(people)
//    println("code it like it's 2004 = $result_1")
//
////    val result_2 = people.filter { it.age > 20}
////    println("code it like it's 2019 = $result_2")
//}
//
///* List filtering done by hand, like it's 2004. */
//fun overTwenty(inputList: List<Person>): List<Person> {
//    val filteredList = ArrayList<Person>()
//    inputList.forEach { person ->
//        if (person.age > 20) {
//            filteredList.add(person)
//        }
//    }
//    return filteredList
//}