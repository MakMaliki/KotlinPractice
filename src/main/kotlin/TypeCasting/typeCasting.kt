package TypeCasting
//IS AND AS

//IS checks whether an object is of a certain type


fun main(){
    val value ="Testing strings"

    if( value is String){
        println("The string has ${value.length} }")
    }


   // AS
    //Convert an object into different type

    val number =90

    if (number<2)  number as String else number as Int

println(number::class.java)



}


