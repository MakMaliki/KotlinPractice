class Expressions {
    fun main(){

        //in keyword Expressions


        var list = listOf(88,99,66,77)

        if (33 in list){
            println("33 is in the list")
        }else{
            println("it is not in the list")
        }


        //not in !n


        if (33 !in list){
            println("Woora")
        }else{
            println("Doora")
        }

        if (33 in 1..10){
            println("it is in here")
        }else{
            println("it is not in here")
        }
    }
}