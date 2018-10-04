/**
 * @Author Ajay on 04-10-2018.
 */

fun main(args: Array<String>){

    //lambda expression

    val add:(Int ,Int) -> Int = {x:Int,y:Int -> x+y}

    //since kotlin infers type functions , we can ignore function declaration with paramters

    val addition = {x:Int,y:Int -> x+y}

    //Higher order functions - takes functions as arguments and returns a function
    val list = listOf<Int>(2,3,4,5,1,5,6,12,25)

    // Here filter is higherorder func which takes a predicate func
    println(list.filter { item -> item %2 == 0 })

    //we can use "it" implicit variable in kotlin when lambda has one variable
    println(list.filter({it % 2==0}))

    //making more concise using extension function
    println(list.filter({it.even()}))

    // Reference function using "::"
    println(list.filter(::isEven))

    //more concise code as lamdbas is only parameter we will get rid of braces
    list.filter {it.even()}
}
   // Reference function
   fun isEven(i:Int) = i%2== 0
   // Extending Int primitive for using it in above function
   fun Int.even() = this %2 == 0
