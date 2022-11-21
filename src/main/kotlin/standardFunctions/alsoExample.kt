package standardFunctions
fun main(){

    var bicycle = MotorCycle().apply {
        speed=455
        ride()
    }.also {
        println("Hello Hello")
    }

    println(bicycle.speed)
}


class MotorCycle {
    var speed = 0

    fun ride(){
        println("I am  Riding my MotorCycle")
    }

}
