package DependencyInjection


fun main(){

    val engine=Engine()
    val turbo = TurboEngine()
    val car = Car(engine,turbo)

    car.startCar()
    car.engine.start()
    car.turboEngine.start()

}



class Engine(){
    fun start(){
        println("Starting Normal Engine")
    }
}

class TurboEngine(){
    fun start(){
        println("Starting Turbo Engine")
    }
}

class Car(val engine:Engine,val turboEngine: TurboEngine){
   // val engine = Engine()//Not good way to create

    fun startCar(){
        println("Starting the car)}")
    }
}

