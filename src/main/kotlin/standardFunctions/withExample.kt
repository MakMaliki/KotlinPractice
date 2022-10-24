package standardFunctions

fun main(){

    var car1 = with(Car()){
        speed =90
        drive()
        println("Hello")
         this
    }

    println(car1)

//    var person = Person()
//
//    with(person){
//
//        age = 44
//        firstName = "Malik"
//        lastName = "Hakim"
//    }



}


class Car {
    var speed:Int = 50

    fun drive(){
        println("Driving at speed of $speed")
    }
}

class Person{
    var firstName = ""
    var lastName = ""
    var age = 44

}