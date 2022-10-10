class ForLoop {
    fun main(){
        //For Loop Kotline
//
//    val cusomer = mapOf(Pair("John",3),Pair("Malik",4),Pair("Jawad",17))
//
//    for (i in cusomer){
//        println("The customer ${i.key} has bought ${i.value}")
//    }
//

//    for (i in 1..10){
//        println("Hello")
//    }
//
//
//    for (i in 10 downTo 0){
//
//        println("Malik")
//    }


//    for (i in 1..100 step 2){
//        println(i)
//    }
//
//println("Please Enter a value")
//    var input = readLine()?:""
//
//    var maxValue = input.toInt()
//
//    for (i in maxValue downTo 0){
//
//        if(maxValue % 7 == 0){
//            println(maxValue)
//        }
//        maxValue--
//    }
//Exercise2

//    for (i in 1..10){
//
//        for (j in 1..i){
//            print("\uD83D\uDE00")
//        }
//        println()
//    }


        println("Enter a number")

        var input = readLine()?:"0"

        var value= input.toInt()

        for (i in 1 .. value){
            for (j in 1.. i){

                var resul = i *j
                when (i*j){

                    0 -> print("\uD83D\uDE30")
                    1 -> print("\uD83D\uDE20")

                    else -> print("\uD83D\uDF00")

                }
            }
            println()
        }

    }
}