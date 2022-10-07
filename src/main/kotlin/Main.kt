const val url = "www.malikfaisal.com"

fun main(args: Array<String>) {

    var myDogNameChangeAble = "Silva"
    val myDogName:String = "Money"

    println(myDogNameChangeAble)


    //Draw a bunny


    println("(\\(\\")
    println("(-.-)")
    println("0_(\")(\")")


    //Length of a String
//Trim Function dosen't remove spaces in the middle
    val myName ="Malik Faisal Hakim  ".trim()

    println(myName.length)
    println(myName.capitalize())
    println(myName.decapitalize())

    //getPosition of a character

    println(myName.get(4))
    println(myName[4])

    //Get PART OF STRING

    println(myName.substring(3))

    /**
     * A client has purchased a number of products that have a certain price

    Print out the total amount that the client needs to pay

    val client = “Mary”
    val products = 3
    val price = 30

     */

    val clientName = "Mary"
    val numProducts = 3
    val priceProduct=30

    println("Hello $clientName The total amount to be paid is ${numProducts * priceProduct}")


    println(url)


    println("Enter a Number")

    val numberInput = readLine()?:""
    val number =numberInput.toInt()

    val multiply = number*number
    println(number*number)





}