package ClassTypes


//A class inside another class using inner keyword
//The inner class can access variables and methods of outer class using the this@NameOuterClass. variable or method
class Car {
    var speed:Int =0

    //The outer class can create instance of inner class

    var engine1 = Engine()


    fun drive(){
        engine1.run()
        println("Driving at speed of $speed")
    }

    inner class Engine{
        var rpm = 300
        fun run(){
            this@Car.speed=400
            this@Car.drive()
            println("This is called from Inner class")
        }
    }

}
fun main(){

    var car1 = Car()

    car1.Engine().run()
}
