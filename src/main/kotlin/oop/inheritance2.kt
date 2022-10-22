
fun main(args: Array<String>){
    //Inheritance

    val boeing737 = Boeing()
    val a320 =AirBus()

    boeing737.name = "Boeing"
    boeing737.speed = 25000

    a320.name = "AirBus"
    a320.speed = 33000


    boeing737.ascend()
    a320.decend()
    boeing737.decend()
    a320.ascend()
    boeing737.decend()
    a320.ascend()
    boeing737.decend()



}

open class AeroPlane(){

    var  name:String = "General Aeroplane"
    var speed:Int = 10000
    var altitude:Double = 20000.0

    fun ascend(){
        altitude += 1000
        println("The $name speed is $speed and altitude is $altitude  ")
    }

    fun decend(){
        altitude -=1000
        println("The $name speed is $speed and altitude is $altitude  ")

    }
}
class Boeing: AeroPlane(){
}
class AirBus: AeroPlane(){
}

