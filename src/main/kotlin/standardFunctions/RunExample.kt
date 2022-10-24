package standardFunctions

fun main(){



//    run {
//        var car = AutoCar()
//
//        car.speed=332
//        car.drive()
//
//        println("Car speed is ${car.speed}")
//
//    }

    AutoCar().run {
        speed =33
        drive()
        println("Car speed is $speed")
    }

   var car3 = AutoCar().run {
        speed =33
        drive()
        println("Car3 speed is $speed")
       this

    }

    println(car3.speed)


}

class AutoCar {
    var speed = 0

    fun drive(){
        println("Car is driving")
    }

}
