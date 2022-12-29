package Kotlinbook

fun main(){

    println("Hallo Bitte enter tag hour und es ist name in deutsch")

    println("Was spat ist es ?")
    println("Wie View uhr ist es ?")
    var number = readln()


   var nameInDeutsch = when(number.toInt()){

       in 7..11 -> "Morgen"
       in 11 .. 13 -> "Vormittag"
       in 13.. 15 -> "Mittag"
       in 15..18 -> "Nachmittag"
       in 18..22-> "Abend"
       else-> "Nacht"
    }

    println(nameInDeutsch)


    fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int>
    {
        return Pair(number * factor, number / factor)
    }
    val (product, quotient) = multiplyAndDivide(4, 2)


}