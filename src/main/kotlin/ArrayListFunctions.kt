class ArrayListFunctions {

    fun main (){

        //ArrayList Functions

        var colors = arrayListOf("Blue","Black","Yellow","Red")

        //Set an Item
        println(colors.set(1,"Cyan"))

        // We can have a subArrauList from an Exisitg array list

        var newcolors = colors.subList(0,2)

        println(newcolors)

        println(newcolors::class.java)

        //Clear all items in an ArrayList

        colors.clear()
        println(colors)

        //Check if an arraylist is empty

        colors.isEmpty()

        println(colors.isEmpty())



    }
}