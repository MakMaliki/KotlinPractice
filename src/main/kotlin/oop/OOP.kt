package oop


fun main(args: Array<String>) {


    //An object is an instance of a class

    val myCar = Car()
    val yourCar:Car = Car()

    println("Print Object My car and change its attribute model and topspeed")

    myCar.model ="Toyota"
    myCar.model ="BMW"

    myCar.start()
    myCar.start()

    myCar.drive(22)
    yourCar.drive(22)



    var animal1 = Animal();

    animal1.topSpeed =564
    animal1.name = "silva"
    animal1.run()

    var dog = Animal();

    dog.topSpeed =333
    dog.name ="Money"
    dog.run()


}

//a class is a blueprint for components and Objects
//Class has variables , Methods

//Name should start with Capital letter
class Car{
    var model:String?=null
    var topSpeed =100

    fun start(){

        println("Starting the model $model")
    }

    fun drive(speed:Int){

        println("Driving at the speed of $speed")
    }
}

class Animal{
    var name:String = ""
    var topSpeed:Int = 0

    fun run(){
        println("$name  speed is $topSpeed")
    }

}