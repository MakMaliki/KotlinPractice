package standardFunctions

import kotlin.random.Random

fun main(){


    //TakeIf
//    for(i in 1..10){
//
//        val number = Random.nextInt(100)
//
//        var EvenOrNull = number.takeIf { number -> number%2==0 }
//
//        println("The number is  $number")
//
//        println("The Number is $EvenOrNull")
//
//
//    }
//
//   // TakeUnless
//
//    for(i in 1..10){
//
//        val number = Random.nextInt(100)
//
//        var OddOrNull = number.takeUnless { number -> number%2==0 }
//
//        println("The number is  $number")
//
//        println("The Number is $OddOrNull")
//
//
//    }


var newNumbers = arrayListOf<Int>()
    for (i in 1..4){

        val input = readLine()?:""
        val number = input.toInt()

        number.takeIf { it %2!=0 }
            .takeUnless { it ==13 || it == 11  }?.let {
                newNumbers.add(it)
            }

    }

    println(newNumbers)
}