package Extensions

//Extension Functions
//Adding functionality to a class that we don't own or cannot modify
//Can extend , Functions, Properties, Companion Objects
//Can access object using this reference
//It is a shortcut to make functions available using the usual Object.function

//The original class is not actually modified
//The new functions are not actually inserted in the class

fun main(){
    val name = "Malik"
    println(name.slim())
}
fun String.slim() = this.substring(1,length-1)


//Extension Properties

//Can add properties to classes , similar way to functions


