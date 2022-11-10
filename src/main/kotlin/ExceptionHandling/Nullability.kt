package ExceptionHandling

class Nullability {

    /**If u use a null value and do an operation
    * with it The program will crash and throw Null Pointer Exception
    * Kotline Guard Against  null Values   ? */
    //Extra.Operators
fun main() {
        var dogName: String? = "Silva"
        dogName = "sdfa"
        dogName = null

        var myDogName: String = "Money"

        myDogName = "ss"

        println(dogName)

        //You can chain operations even if you have null Value

        var name: String? = "Mallik"
        println(name?.length.toString())
        name = null
        println(name?.length.toString())


        //Arithmatic operators only works if variable  is not  null
        //For that purpose we use other type of methods

        var number: Int? = 121
        println(number?.plus(23))
        println(number?.div(2))
        println(number?.minus(22))
        println(number?.times(2))
        println(number?.rem(3))

        //Practice Null

        var newValue: String? = "MalikFaisal"

        newValue = newValue?.substring(3, 6)

        println(newValue)

        var newValueDouble: Double? = 121.3

        newValueDouble = newValueDouble?.times(6)

        var newValueFloat = newValueDouble?.toFloat();

        println(newValueFloat)

        var userName: String = readLine() ?: ""

        println("The length of User Name is ${userName.length}")

        /**
         * Read a number from the console and convert it to Double.

        Multiply it by 7, and convert the result into a string.

        Print the length of that string to the console.
         */


        var numFromConsole = readLine() ?: ""


        var numDouble = numFromConsole.toDouble()

        println(numDouble)

        numDouble *= 7
        println(numDouble)

        println("The Result is " + numDouble.toString().length)


    }


}
