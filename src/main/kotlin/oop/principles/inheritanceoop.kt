package oop.principles



fun main(){

    val benzCar = BenzCar()

    benzCar.getInfo()
    benzCar.accelerate()

}
open class Car{
    constructor(newModel:String){
        model=newModel
    }
    open var model:String = "General"
    var kmRun:Int =0

    fun accelerate(){
        println("The car accelerated and its started")
    }

    open fun getInfo(){
        println("The car model is $model and it has runned $kmRun")
    }

}

class BenzCar :Car(""){
    override var model = "BenzCar3232"

    override fun getInfo() {
        println("The car model is $model")
    }

}