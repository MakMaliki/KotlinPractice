package oop.Interfaces


fun main(){

    val myFactory = CarFactory()

    var myCar:Car = myFactory.provideCar()
    myCar.speed=333
    myCar.park()
    myCar.drive()


}
interface Car{
    var speed:Int
    fun drive()
    fun park()
}

class BMW:Car{
    override var speed: Int = 290

    override fun drive() {
        println("BMW is driving at speed $speed" )
    }

    override fun park() {
        println("BMW is parked" )
    }
}

class CarFactory {
       fun provideCar():Car{
           return  BMW( )
       }

}