package functions

class HigherOrderFunctions {
    fun main(){
        //Common Higher Order Funcgtions
        //ForEach

        var clients = listOf("Anna","Joe","Malik")
        println(clients)

        //Filter
        clients.filter { it.length>4 }.forEach { println("Hello there $it" )}


        //Map , Create a new list based on the lambda

        var newNameslength4= clients.map { it.length}

        println("Map"+newNameslength4)


        //Sortet by
        var newNamesLength22= clients.sortedBy { it.length }
        println("SortedBy"+newNamesLength22)

        //Max Length Items
        var maxLengthEelements = clients.maxBy { it.length }
        println("MaxBy"+maxLengthEelements)

        //Min Length Items
        var minByLengthElements =  clients.minBy { it.length }
        println("Minby"+minByLengthElements)



    }
}