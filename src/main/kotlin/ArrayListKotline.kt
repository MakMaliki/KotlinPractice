class ArrayListKotline {

    fun main(){
        //// ArrayList - Mutable(ChangeAble) List of items
//    var colors = arrayListOf("White","Black","Red","Green","Blue");
//
//    //We can define empty Arraylist but we have to Define type of its items
//
//    var colors2 = arrayListOf<String>()
//
//
//    //We can add Items to an ArrayList using add() method
//
//    colors.add("Pink")
//    //Pink should be added now
//    println(colors)
//
//    //We can add an ArrayList to existing Arraylist using addAll() method
//
//    var newColos = arrayListOf("Gold","Brown","Gray")
//
//    colors.addAll(newColos)
//
//    //We can remove an item from an ArrayList using remove
//    println(colors[4])
//    colors.remove("Blue")
//    println(colors)
//
//    //We can remove an ArrayList from an arrayList using removeAll
//
//    colors.removeAll(newColos)
//
//    println(colors)
//
//        //We can remove an item in specific place using removeAt[Index]
//    colors.removeAt(2)
//
//    println(colors)
//
//
//    //Exercises
//
//    var favAnimals = listOf("Cow","Dog","Chicken","Duck")
//
//    println(favAnimals)
//
//    println(favAnimals[2])
//    println(favAnimals.get(2))
//
//
//    var favAnimalsArraylist= arrayListOf("Money","Blood","Jack","Contor")
//
//    var favAnimalsMike = arrayListOf("Silva","Titus")
//
//    favAnimalsArraylist.addAll(favAnimalsMike)
//
//
//    favAnimalsArraylist.removeAt(3)
//
//    favAnimalsArraylist.removeAll(favAnimalsMike)




        var bestFriends = arrayListOf("Jack","Alves","Jalal","Nasim","Saber","Wasim","Taban",null)

        var removeFriends = listOf("Jack","Alves","Saber")


        bestFriends.removeAll(removeFriends)

        println(bestFriends)
    }
}
