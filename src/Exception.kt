import java.io.IOException

/**
 * @Author Ajay on 03-10-2018.
 */

fun main(args: Array<String>){

    /**
     * WHY NO CHCEKED EXCEPTIONS
     * In java we use checked exceptions which are been propogated to methods calls and its makes it uneasy
     * to track when exceptions occur, as it forms big hierarchy, so kotlin avoids it and also its better the
     * handle checked exceptions in the method itself if possible.
     *
     * In kotlin its only unchecked exceptions which does not force to throw an exception when your calling a
     * method nor the compiler tells to add try catch
      */

    // try catch as a expression which is printed
    val value = try {
           getInput()
       }catch (e: IOException){
           e.printStackTrace()
       }finally {
           println("Finally trying to read input")
       }
    println(value)
}

fun getInput(){

    // no new keyword like java
    throw IOException("Could not read input")
}