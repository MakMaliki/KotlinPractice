package collections



fun main(){

    val myNamesList = mutableListOf("Malik","Hakim","Arash","Faisal","Komail")

    myNamesList.forEach{ it
        if (it.length>5){
            println(it)

        }
    }

}