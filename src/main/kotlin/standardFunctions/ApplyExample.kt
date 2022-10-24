package standardFunctions


fun main(){

    var bicycle = Bicycle().apply {
        speed=455
        ride()
    }

    println(bicycle.speed)
}


class Bicycle {
    var speed = 0

    fun ride(){
        println("I am  Riding my bike")
    }

}
