package collections

class ListFunctions {
    fun main (){
        var bestPlanguages= listOf("Kotline","Java","Python","C++","Swift","Kotline")


        println(bestPlanguages)

        //Size of a list
        println(bestPlanguages.size)

        //Check if a list contains an element the return is true or False -- conatinsAll(LIST)
        println(bestPlanguages.contains("Java"))

        //Getting indext on

        println(bestPlanguages.indexOf("Kotline"))

        //Remove last index of a list
        println(bestPlanguages.lastIndexOf("Kotline"))

    }
}