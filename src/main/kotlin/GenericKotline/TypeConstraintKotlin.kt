package GenericKotline
//We can restrict type of generic parameters

fun main(){

val chef1 = Chef<Apple>()
    chef1.cook(Apple())
}
abstract class Fruit {
    abstract fun peel()
}

class Apple:Fruit(){
    override fun peel() {
        println("Peeling the Apple")
    }
}

class Banana:Fruit(){
    override fun peel() {
        println("Peeling the Banana")

    }
}

class Chef<T:Fruit>{
    fun cook(item:T){
        item.peel()
    }
}
