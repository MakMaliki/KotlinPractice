package Extra

class Operators {
    fun main(){
        println("Please Enter the amount u have in the bank")
        val amount = readLine()?:""
        val amountNumber = amount.toDouble()

        val interestRate = 5.5/100

        val numYears = 5

        val amountRate = amountNumber*(1+(interestRate*numYears))

        println("The user will have $amountRate in $numYears Years")

        val cows=6
        val cowMilk=0
        val children=0


        val funding = (cows<=5 && cowMilk>=1 ) || children+2 >3

        println("The family is Eligable for funding $funding")


    }
}
