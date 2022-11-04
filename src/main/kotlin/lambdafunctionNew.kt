import functions.printMyName

/**
 * Pass a function as a paramter to another function
 * */

fun main(){

//showNameLambda("Malik")
//printMyName("Hakim")


    enhancedMessage("Malik"){22 }

}

fun sum(a:Int,b:Int):Int{
    return a+b
}

val sumLambda:(Int,Int)->Int = {a,b -> a+b}


fun calculateCatAge(age:Int):Int = age*7

//VAL lambdaName(params) :-> TYPE = {paramsList -> CodeBody}
val calcAge:(Int)->Int={a ->a*7}

fun showName(name:String){
    println(name)
}


var showNameLambda:(String)->Unit ={name->
    print(name)
}


// Trailing Lambda
//We can add a function as a parameter to another Function

//If the last parameter of a function is a function,
//Then a lambda expression passed as correspondant could be passed outside as Argument

//The passed function in lambda could be anything but it should return the request result type
fun enhancedMessage(message:String, funAsAparameter: ()-> Int){
    println("Your name is $message and the user age is ${funAsAparameter()}")
}