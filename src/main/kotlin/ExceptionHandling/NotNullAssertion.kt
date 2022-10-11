package ExceptionHandling

class NotNullAssertion {

    fun main(){
//Elvis Operator ?:

        var myDogName:String?= null

        println("The result is ${myDogName?:"Silva"}")


        //Null Assertion

        // !! Developer gurantee that the value won't be null

        //Try to avoid it

        var catname:String? = null

        println(catname!!.length)

    }
}