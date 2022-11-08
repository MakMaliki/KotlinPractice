package Section11


fun main(){

    val car1 = Car()
    val car2 = Car()


    println(car1.color)
}

class Car(
    var color: String = "Blue",
    var model: String = "VM3232"): Any() {

    init {
        color ="Red"
        model ="asdfa"
    }


    fun drive(){

        println("Hello There from Drive Function")
    }

}
