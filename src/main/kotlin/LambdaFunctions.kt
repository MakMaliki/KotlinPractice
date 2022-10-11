class LambdaFunctions {
    fun main(){

        //Lambdas Functions

        //Lambda is an anonymous function (has no name)

        //Lambda functions can have parameters
        // they are declared at the start of the block
       // {name:String -> print("Hello $name")}
        //Lambda can be assigned to a variable ,
        // The variable can be passed as a parameter to a new higher order function
        // var lambda = {name:String -> print("Hello $name")}
        //  println(lambda)


        //Higher Order Function
        //is a function that takes another function as a parameter



        val names = arrayListOf("Malik","Jawad","Zabi","Nawid")
        val myLambda = {name:String-> println("Hello there $name") }

        //We can directly pass lambda as a parameter or out function paramter
        // sayHello(names,myLambda)

        sayHello(names) {name:String-> println("Hello there $name") }
//
        var arrListItems = arrayListOf<Int>(33,54,90,78,45,67,34,54);

        var lambda = {item:Int -> println(item) }
        var lambda2 = {item:Int -> println(item/10) }
        higherOrderFunc(arrListItems,lambda2)




        //   var numbers=  arrayListOf<Int>(99,78,67,54,34,67,89)

//    println(numbers)
//    var lambda ={num:Int -> num/10}
//
//   var newNumbers = update(numbers) {num-> num/10}
//
//    println(newNumbers)


     //   var names= arrayListOf<String>("Malik","Faisal","Hakim","Kiarash","Arash")

        // var lambd ={name:String ->"Hello There $name"}
        var newMessages = update2(names){name:String ->"Hello There $name"}

        println(newMessages)



    }
}
fun sayHello(names:ArrayList<String>,doSomething:(String)->Unit){

    for (name in names){
        doSomething(name)
    }
}

fun printMyName(name:String){
    println("Hello $name")
}


fun higherOrderFunc(number:ArrayList<Int>,evenElement:(Int)->Unit){

    for (item in number){
        evenElement(item)
    }
}


fun update(numbers:ArrayList<Int>,lambdaFunc: (Int)->Int):ArrayList<Int>{

    for (item in 0..numbers.size-1){

        if (numbers[item] %2 ==0){
            numbers.add(lambdaFunc(numbers[item]))
        }

    }

    return numbers

}

//Exercise 2

fun update2(clientNames:List<String>,lambd:(String)->String):ArrayList<String>{

    var newPMessage = ArrayList<String>()
    for (item in clientNames){
        newPMessage.add(lambd(item))
    }
    return newPMessage
}



