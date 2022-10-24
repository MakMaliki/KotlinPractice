package oop.Interfaces

fun main(){
//var oven:Oven = Bosch()
    var oven:Oven = getOven()

    oven.cook(32)
    oven.turnOff()
    oven.turnOn()
}

interface Oven {

    val temperature:Int

    fun turnOn()
    fun turnOff()
    fun cook(temInt:Int){
        println("Cooking at degree $temInt")
    }
}
class Bosch() :Oven{
    override val temperature: Int = 323

    override fun turnOn() {
        println("The Bosch is turned on")
    }

    override fun turnOff() {
        println("The Bosch is turned off")

    }
}

fun getOven():Oven{
    return Bosch()
}