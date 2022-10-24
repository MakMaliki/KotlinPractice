package ClassTypes
//Useful for creating a class for Storing Information
//Primary Constructor should have at least one parameter
//A primary Constructor parameter needs to be var or val

//We can print the whole object detail not its reference in Ram

fun main(){
    var person = Person("Malik","Hakim",28)
    var person2 = Person("Malik","Hakim",28)
    var person3 = RegularPerson("Malik","Hakim",28)
    var person4 = RegularPerson("Malik","Hakim",28)

    println(person.name)

    println(person)

    println(person == person2) //This should returns true because both are instance of a data class and has same data
 //   println(person == person3) //This is Error u cant compare data class instance with Regular class instance


    println(person3 == person4)

    //Methods Class Methods
    //    .equals or ==  --> compares data not objects

    //toString   --> prints out variable names and data

    //copy  --> create a copy with only some data changed


    var person5 = Person("Faisal","Hakim",22)

    var person6 = person5.copy(age = 33)
    println(person6)



}
data class  Person(val name:String, val lastName:String,val age:Int){
}
class RegularPerson( name:String, lastName:String, age:Int){
}
