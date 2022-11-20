package collections

class ListKotline {

    fun main()
    {

        //List kotline

//Ordered Collection of Items That are not changeable -- Immutable
// can contain duplicate elements

        var names = listOf("Malik", "Faisal",9032,33.3,32f)

        println(names)
        println(names[2])


        //If we create Empty List we must specify the type as well
        var colors2 = listOf<String>()


        //A list can contain duplicate elements

        var colors3 = listOf("BLue","BLue", "BLue")
        println(colors3)

        // A list can contain Null Values
        var colors4 = listOf("Malik","Faisal",null,null)
        println(colors4)


        // We can access Elements of a list in two ways

        //1) by LISTNAME.[Index]
        println( colors4[3])


        //2) By LISTNAME.get()
        println(   colors4.get(2))


        //We can get the size of LIst by Listname.size
        println(colors4.size)



        //List Functions


    }
}
