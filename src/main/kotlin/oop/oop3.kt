fun main(args: Array<String>){


    //In kotline everythin is an object
   // String, INT, fLOAT, Boolyean, ArrayList, Hashmap


   // Collections are not objects they are interfaces

    val animals = listOf("cat","dog","horse")


    // object definition classes can contain references to other Objects

    var garage =Garage()

    garage.car.drive()
}



class MyCar{



    fun drive(){
        println("Driving along in my car")
    }


}

class Garage(){
    val car = MyCar()
}


