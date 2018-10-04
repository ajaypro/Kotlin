/**
 * @Author Ajay on 03-10-2018.
 */

fun main(args: Array<String>){

    // not giving the 2nd argument separator as it is already has default parameters values in function declaration
    val value1 = concat(listOf("kotlin", "Java", "Bentely"))
    // different orders of arguments can be used as long as arguments types are mentioned
    val value = concat(separator=":", words = listOf("kotlin", "Java", "Bentely"))
    print("$value")


}
 // 2nd argument separator has default values mentioned
fun concat(words: List<String>, separator:String = " -") = words.joinToString(separator)