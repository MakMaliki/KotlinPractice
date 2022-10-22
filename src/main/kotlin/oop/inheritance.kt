fun main(args: Array<String>){
    //Inheritance


    var cookerSpaniel = CookerSpaniel()

    cookerSpaniel.age = 10

    cookerSpaniel.bark()
    cookerSpaniel.play()
    cookerSpaniel.details()
}

open class Dog {

    var age: Int = 0

    fun bark() {
        println("WOOOFOW WOOF")
    }

    fun play() {
        println("Run , Play Run, Play")
    }
    fun details() {
        println("My age is $age")
    }
}


class CookerSpaniel: Dog(){

}




