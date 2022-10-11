package functions

class whenStatement {
fun main(){

    println("Welcome to Ballon Dor Program")
    println("Please Vote for these 3 Players")
    println("Press 1,2,3 for MESSI \nPress 4,5,6 for Ronaldo \nPress 7,8,9 for Kaka")

    var input = readLine()?:"0"

    var number = input.toInt()

    var messiScore:Int=0
    var ronaldoScore:Int=0
    var kakaScore:Int=0


    var winner= when(number){
        1,2,3 -> "Messi"
        4,5,6 -> "Ronaldo"
        6,7,8 -> "KAKA"
        else -> "Simone"
    }


    println("The winner is $winner")


    var months = listOf("January","February","March","April","May","June","July","August","September","October","November","December")

    var item ="January"
    var numDays = when(item ){
        "January","March","May" -> 31
        "February" -> 28
        else -> 30
    }

    println("The month $item has $numDays Days")


}
}
