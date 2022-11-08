package section10


fun main(){

//    //List
//
//    val listOfNames = listOf("Malik","Faisal","Hakim","Arash")
//    val listOfNamesMutable = mutableListOf("Malik","Faisal","Hakim","Arash")
//    println(listOfNames)
//
//    listOfNamesMutable.add("Asad")
//    for (item in listOfNames){
//        println(item)
//    }
//    listOfNames.forEach {
//     println(it)
//    }
//
//    //Set set is collection of unique Elements
//    //
//
//    val mySet = setOf("USA","RUUSIA","CHINA","IRR")
//    val mySetMutable = mutableSetOf("USA","RUUSIA","CHINA","IRR")
//
//
//    mySet.forEach {
//        println(it)
//    }
//
//    //Map, Map Values, Key Values relationship
//
//    val secretMap = mapOf(1 to "Malik",2 to "Jawad",3 to "Nawab")
//    val secretMapMutable = mutableMapOf(1 to "Malik",2 to "Jawad",3 to "Nawab")
//
//    secretMapMutable[5] = "Hamza"
//
//    println(secretMap)
//    println(secretMap.values)
//
//
//    // Initalizing Lists
//
//    var listCars = listOf<String>()
//    var listCarsMutalble = mutableListOf<String>()
//
//
//    //Empty Collection
//
//    val emptyList = emptyList<String>()
//    val emptyListMutable = mutableListOf<String>()
//    val emptySet = emptySet<String>()
//    val emptyMap = emptyMap<Int, String>()



    var listOfFavPlayers = listOf<String>("Malik","Lebron","Messi","Neymar","De bryune","Roger Fedrer","Schumakher","Floyed Mayweather","Conor MacGregor","kohli",)


   val favFootballPlayers = listOfFavPlayers.filter {it ->
//       it == "Messi" || it == "Neymar"
       it.startsWith("M") || it.endsWith("mar")
    }

    println(favFootballPlayers)





}