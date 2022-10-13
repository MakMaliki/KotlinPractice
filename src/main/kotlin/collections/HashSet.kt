package collections

class HashSet {

    fun main(){

        //Mutable set of items called collections.HashSet

        //collections.HashSet ,
        //  Mutable set collections.HashSet
        //    not duplicate items

        var scores = hashSetOf(22,33,44,55,55)


        //Creating an empty Hash Set
        var newScores = hashSetOf<Int>()

        //  print(scores)
        //print(newScores)

//a new collections.HashSet
        var mathScores = hashSetOf(883,44,333)
        println(mathScores)

        //We can hashset to another hashSet

        scores.addAll(mathScores)

        println(scores)

        //Remove an eLEMENT

        scores.remove(883)

        scores.removeAll(newScores)

        println(scores)


        //Remember the set is mutable u cant add or remove data
        //Hashset is immutable u can add or remove data



        var colors = hashSetOf("Blue","Red","Yellow")

        val newColors = hashSetOf("Red","Brown")

        colors.add("Cyan")

        colors.remove("Blue")

        colors.removeAll(newColors)
        colors.size

        println( colors.removeAll(newColors))
        println(colors)


        //Exercise

        var deskItems= hashSetOf("Lighter","Notebook","Monitor","Roller","Nail Cutter","Pen","LipStick")

        var removeableItems = setOf("Lighter","Roller","Nail Cutter","LipStick")

        deskItems.removeAll(removeableItems)

        println("The deskItems are"+deskItems)



        //HashSetFunctions

        var names= hashSetOf("Malik","Faisal","Hakim","Kiarash","Kia")

        var newNames = hashSetOf("Faisal","Malik","Jivoni")
        println(names.size)
        println(names.retainAll(newNames))
        println(names)


        var primeNumbers = setOf(2,3,5,7,11,13,17,19,23,29)

        println ("The number 21 is "+primeNumbers.contains(29))
        println ("The number 21 is "+primeNumbers.contains(30))


        var myFavDrinks = hashSetOf("Cola","Beer","Vodka","Water")
        var myFriendFavDrink = setOf("Beer","Water","Apple Juice","Tea")

        myFavDrinks.retainAll(myFriendFavDrink)
        println("The drinks which we both likes are  $myFavDrinks")




    }
}