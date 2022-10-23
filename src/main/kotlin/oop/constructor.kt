
fun main(args: Array<String>){
    //Constructors

  //  defines set of variable that are available at the creation of an object

    val myCar = Car("BMW",2300)

    val yourCar = Car("Merceds")

    val hisCar = Car()

}
//Different Ways to create a class

class Car{

    constructor(){
        model ="No Model"
        topSpeed =160
    }

    constructor(newModel:String){
    model = newModel
    }

    constructor(newModel: String,topSpeed:Int){
        this.topSpeed=topSpeed
        model =newModel
    }

    var model:String?=null
    var topSpeed= 100
}
