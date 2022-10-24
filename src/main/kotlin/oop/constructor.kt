
fun main(args: Array<String>){
    //Constructors

  //  defines set of variable that are available at the creation of an object

    val myCar = Car12("BMW",2300)

    val yourCar = Car12("Merceds")

    val hisCar = Car12()

}
//Different Ways to create a class

class Car12{
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
