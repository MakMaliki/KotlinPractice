package Kotlinbook


fun main(){

    //*Ranges*

    //Always  Increasing   .. and until
    val closedRange = 0..5    //0,1,2,3,4,5
    val halfOpenRange = 0 until 5   //0,1,2,3,4


    //Decrease Range DownTo

    val decreaseRange = 5 downTo  0 // 5,4,3,2,1,0

    println(closedRange)


    // For Loops

//    for ( Variable in range ) {
//        Loop Code
//    }


//    val count =10
   var sum = 0
//
//    for (i in 1..count){
//        sum+=i
//    }

    //Sum Odd Numbers

    val count = 10

    for (i in 1..count step 2){
        sum+=1
    }

    //Sum for Even Numbers

    for (i in count downTo 1 step 2){
        sum+=i
    }

    println(sum)



    sum = 0
    for (row in 0 until 8) {
        if (row % 2 == 0) {
            continue
        }
    }

    sum = 0
    rowLoop@ for (row in 0 until 8) {
        columnLoop@ for (column in 0 until 8) {
            if (row == column) {
                continue@rowLoop
            }
            sum += row * column
        }
    }


    println("Total Sum "+sum)
}
