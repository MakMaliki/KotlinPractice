package collections

class HashMapKotlin {
    fun main(){

        // HashMaps: Maps that can be changed
        //Mutable Maps called HashMaps

        var subjects = hashMapOf(Pair(1,"Math"), Pair(2,"Physic"), Pair(3,"TrigonoMetry"))

        println(subjects)

        //Empty Hashmap

        var favSubjects = hashMapOf<Int,String>()


        subjects.put(4,"History")

        var newSubJects = mapOf(Pair(5,"Chimistry"),Pair(6,"Islamic laws"))

        subjects.putAll(newSubJects)

        println(subjects)

        println(subjects.size)

        //Remove an Item

        println(subjects.remove(5))
        println(subjects)

        //Update a value

        println(subjects.replace(2,"Geography"))

        println(subjects)

        //
//    //Map, HashMap Functions
//
//
//
//    var bestFrinds = hashMapOf(Pair(1,"Jalal"),Pair(2,"Julio"),Pair(3,"Wasim"))
//
//    println(bestFrinds)
//
//    //Check for the key
//
//   println(bestFrinds.containsKey(3))
//
//    //Check for Value
//   println(bestFrinds.containsValue("Jamal"))
//
//       //Is empty
//
//    println(bestFrinds.isEmpty())
//
//    println(bestFrinds.isNotEmpty())
//
//
//    println(bestFrinds)
//
//
//    var customers = hashMapOf(Pair(1,"Malik"),Pair(32,"Faisal"), Pair(111,"Hakim"))
//
//    println(customers.isEmpty())
//
//    println("IS  Hakim A CUSTOMER ?  : ${customers.containsValue("Hakim")}")
//
//    print(" Malik Bought ${customers.containsValue("Malik")}")

        //Exercis

        var attendance = hashMapOf(Pair("23Sep", 2837), Pair("24Sep", 3726), Pair("25Sep", 6))

        attendance.put("26Sep",7)


        var totalAttendancefor2625:Int? = attendance.get("25Sep")?.plus( attendance.getValue("26Sep"))

        println(totalAttendancefor2625)

        println(attendance.containsKey("22Sep"))

    }
}