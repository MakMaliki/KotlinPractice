class NestedWhileLoop {
    fun  main(){
//    var number=10
//    while (number>0){
//        println("Hello Malik")
//        number--
//    }
//
//    val cats = listOf("Tiger","Panzer","Jugen","MMSE","Ronad")
//
//    var index= 0
//    while (index < cats.size ){
//        println("Hello ${cats.get(index)}")
//        index++
//    }

//    var number = 77
//
//    var index =0
//
//    while (number>index){
//        val num = index % 7 == 0
//        if (num){
//            println(index)
//        }
//        index++
//    }

//
//    var i =0
//    var j =0
//
//    while (i<10){
//        while (j<i){
//            print("\uD83D\uDE00")
//
//            j++
//        }
//        i++
//        j =0
//
//        println()
//    }
//
//
//    do {
//        var input= readLine()
//        var change =input?.toInt()
//
//        println(change)
//
//    }while (change!! < 100)


        val usernames = hashSetOf("John","Bob", "Malik")
        println("Please enter a name")

        do {
            val name = readLine()


        }while (name in usernames)

    }
}