fun main(args: Array<String>){
    println("Hello Program")

   var animal = Animal12()
    animal.name = "Lion"
    animal.topSpeed = 2300
    animal.run()

    var animal1 = Animal12()
    animal1.name = "Cat"
    animal1.topSpeed = 1300
    animal1.run()

    var math1= Math()

    println(math1.add(3,4))

}
class Animal12{

    var name = ""
    var topSpeed = 0

    fun run(){
        println("The $name top speed is $topSpeed")
    }



}


class Math{

    fun add(firstNum: Int,secondNum: Int) = firstNum+secondNum

    fun sub(firstNum: Int,secondNum: Int) = firstNum- secondNum

    fun mul(firstNum: Int,secondNum: Int):Int{
        return firstNum*secondNum
    }

    fun div(firstNum: Int,secondNum: Int):Int{
        return firstNum/secondNum
    }
    
}
