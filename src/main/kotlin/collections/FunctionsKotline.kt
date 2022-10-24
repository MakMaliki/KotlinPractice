package collections

class FunctionsKotline {
    fun main(){

//    var index =5
//
//    do {
//        index--
//        printAlphabet()
//
//    }while (index>0)
//
//    printAlphabet()
//    println()

//    var names = listOf("Malik","Faisal","Hakim")
//
//    sayHelloToMyNames(names)


        //  doubleNumberandName(45.5, "")
//
//  var area = radiusArea(4)
//    var area2 = radiusAreaEasy(4)
//
//
//    println("The area is equal to "+area)
//    println("The area is equal to "+area2)
//
//
//
//   val lifeSpan = calculateLifeSpanAnimal("cat")
//
//    println(lifeSpan)
//

        var names = listOf("Malik","Faisal","Hakim")
        var name = "Malik"
        printNames(name)

        printNames(names)

        sayHello("Jamal","Kamal","Nawab")

    }

    fun printAlphabet(){

        for(item in 'A'..'Z'){
            print(item+" ")
        }
    }

    fun sayHelloToMyNames(people:Collection<String>){

        for (person in people){
            println("The name on the person is "+person)
        }

    }

//Parameters in a function can have default values

    fun doubleNumberandName(number:Double= 9.3 , name:String ="Malik"){

        println("The value of double is $number and the value of Number is $name")
    }


//Return Function

    fun radiusArea(radius:Int):Double{
        val pi = 3.141516
        return pi*radius*radius
    }

    fun radiusAreaEasy(radius: Int) = 3.141516* radius*radius


    fun calculateTax(price:Double) =price* 0.2

    fun calculateLifeSpanAnimal(name:String):Int{

        val lifeSpan = when(name){
            "cat"-> 15
            "dog"-> 10
            else ->20
        }
        return lifeSpan
    }



    fun printNames(name: String){

        println("The name is $name")
    }

    fun printNames(names:Collection<String>){

        for (item in names ){
            println(item)
        }
    }
}
fun costProduct(name:String, price:Double?){
    val finalPrice = price?.times(1.2)
    println("The product cost is $finalPrice")
}

fun costProduct(products:Map<String,Double?>){

    for (item in products.keys){
        costProduct(item,products[item])
    }

    println()
}

fun sayHello(vararg  name:String){
    for (item in name){
        println(item)
    }
}
