package ClassTypes

//Enum is a collection of a Constants

//The constants defined are Objects

//The constants have properties

fun main(){

    println(decideColor(Colors.RED))

    //Enum constants can be Initialized
//Constants have properties like
//name
    println(EnumColorsProperties.BLUE.name)

    //Properties
    println(EnumColorsProperties.BLUE.timeUsed)
    println(EnumColorsProperties.RED.timeUsed)

//ordinal
    println(EnumColorsProperties.RED.ordinal)


}


fun decideColor(color: Colors):String{

    return when(color){
        Colors.BLUE -> "The color is Blue"
        Colors.RED -> "The Color is Red"
        Colors.GREEN -> "The Color is Green"
        Colors.YELLOW -> "The Color is Yellow"
    }

}

enum class Colors{
    BLUE,
    RED,
    GREEN,
    YELLOW
}

enum class EnumColorsProperties(val timeUsed:Int){
    BLUE(22),
    RED(21),
    GREEN(20),
    YELLOW(10)
}
