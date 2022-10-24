package GenericKotline
fun main(){
    val box = Box<String>()

    box.display("item")

    val box2= Box<Int>()
    box2.display(2)

    val box3= Box<ArrayList<String>>()
    box3.display(arrayListOf("Malik","Faisal"))


    val box4= Box<NewCar>()
    box4.display( NewCar())


    val box5= Box2<String, String>()
    box5.display("Malik","item")

    val box6= Box2<String, Int>()
    box6.display("Malik",2)
}

class Box<T>{

    fun display(item:T){
        println(item)
    }
}

class Box2<T,U>{

    fun display(item:T,unit:U){
        print(item)
        println(unit)
    }
}

class NewCar{}