package standardFunctions

import java.awt.List

fun main(){
//
//    val animals = listOf("Cow","Dog","Cat","Mouse","Elephant","Giraffe")
//
//
//val animal2= animals.map { listItem ->
//    listItem.length
//}.filter { it==3 }.let { fList->
//    println(fList)
//    println(fList.size)
//}
//
//    var number = readLine()
//
//    number?.let { number ->
//
//      var number= number.toInt()
//        number = number*2
//
//        println(number)
//
//
//    }



    var list = arrayListOf<String?>()

    for(i in 1..4){

        println("Please enter ")

        var animal = readln()

        animal.let {animalInput ->

        if (!animalInput.isEmpty()){
            list.add(animalInput)
        }else{
            list.add("0")
        }

        }

    }
    println(list)



}