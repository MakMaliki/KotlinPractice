package ClassTypes

import javax.crypto.Mac

//Create nice hirarchy

//Useful in When Expression

fun main() {
//    val myVehicle = getVehicle()
//
//    when(myVehicle){
//        is Machine -> println("You have a car")
//        is Bicycle -> println("You have a bicycle")
//    }

    val myPrize = getPrize()

    println(myPrize)

  val value=  when(myPrize){
        is FlyTicket -> "yoU GO TO ANOTHER COUNTRY"
        is HouseKey -> "yoU get a new place"
        is GifCard -> "You get a new Gift Card"
      else -> {"Nothing"}
  }
    println(value)
}
fun getPrize():Prize = HouseKey()


//
//fun getVehicle():Vehicle = PEGASUS()
//abstract class Vehicle
//
//sealed class Machine:Vehicle()
//
//sealed class Bicycle:Vehicle()
//
//class BMW:Machine()
//
//class PEGASUS:Bicycle()
//

abstract class Prize

sealed class House:Prize()
sealed class Ticket:Prize()
sealed class GifCard:Prize()

class HouseKey:House()
class  FlyTicket:Ticket()
class  GiftCard1:GifCard()

