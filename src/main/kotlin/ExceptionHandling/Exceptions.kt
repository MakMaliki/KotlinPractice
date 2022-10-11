package ExceptionHandling

class Exceptions {
    fun main(){
//ExceptionHandling.Exceptions
        //All exceptions have a 1) Message 2)Stack Trace 3) Optionally a cause

//    var number = readLine()

        // println(number?.toInt())


        //Manage ExceptionHandling.Exceptions -> TRY catch

//    try {
//        println(number?.toInt())
//
//    }catch (e:Exception){
//      //  println("An Exception has occured of type ${e.localizedMessage}")
//        println(e.printStackTrace())
//    }


        //ExceptionHandling.Exceptions - Finally A block will be executed whether an exception  has occurred or not
//
//    try {
//        println(number?.toInt())
//    }catch (e:Exception){
//        println(e.message)
//    }finally {
//        println("This part was done")
//    }


        // Create your own Exception, something happend to program

//    throw  IllegalStateException("Don't like this output")



        //Exercise

        println("Please Enter a number")
        var number = readLine()
        try {
            var number1 = number?.toInt()
            println("The value is "+number1?.times(5))
        }catch (e:Exception){
            println(e.printStackTrace())
        }
    }
}