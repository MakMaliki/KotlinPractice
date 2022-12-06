package Extra

class ShortIfandIf {
    fun main(){
        //If Statement
        //Short If
        //Expresssion is something that returns a value

        //Exercise
        println("Do you have the car keys ?")

        val input = readLine()?:"noidea"


        var hasCarKeys:Boolean

        //if (input == "yes")
        if (input.equals("yes")){
            println("You can drive car")
            hasCarKeys = true
        }else{
            println("You can't drive car")
            hasCarKeys = false

        }





        if (hasCarKeys){
            println("The cas has been started")
        }else{
            println("You can't start the car")
        }

        println("Who is the Goat in Soccer")
       // var input = readLine()

        var messiPoints:Int =0
        var ronaldoPoints:Int =0
        var points =  if( input =="Messi") messiPoints++ else ronaldoPoints++

        println(messiPoints)
        println(ronaldoPoints)

        println("Please Enter your Score");

     //   var input = readLine()?:""

        var score = input.toInt()

        var grade= if(score>=90){
            "A"
        }else if(score>=80){
            "B"
        }else if(score>=70){
            "C"

        }else{
            "D"

        }

        println("Your Grade is $grade")

    }
}
