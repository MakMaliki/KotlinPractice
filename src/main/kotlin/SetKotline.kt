class SetKotline {
    fun main(){


        //Set of unique elements
        // in undefined order
        // .. Immutable


        var scores = setOf(100,89,99,"Fail",99)

        println(scores)


        var myScores= setOf<Int>()

        println(myScores)

        //A set can have null value but only one

        var mynewScores = setOf(22,22,33,null,myScores)

        println(mynewScores)




//Set Functions

     //   var scores = setOf(99,97,95,94,null)
        var lowScores = setOf(88,81,43)

        println("The size is "+scores.size)


        //Check if it has an item using contains(itme)

        // scores.contains(99)
        println(scores.contains(99))
        println(scores.contains(100))


        println(scores.containsAll(lowScores))

        println(scores.containsAll(setOf(33,37)))


        println(scores.isEmpty())






    }
}