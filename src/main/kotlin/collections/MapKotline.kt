package collections

class MapKotline {
    fun main(){


//Map
//Set of Key Value Pair items
        //keys are unique
        //VALUES can be duplicate
//Immutable we cant change after its creation


        var counts = mapOf(Pair(1,"One"), Pair(2,"Two"), Pair(3,"Three"))

        println(counts)

        //Creating an empty Map require valueType for both Key and Value
        var newCounts = mapOf<Int,String>()

        //Get item from a map

        println(counts.get(2))

        println(counts[1])

        //We can key all Keys

        println(counts.keys)
        println(counts.values)


    }
}