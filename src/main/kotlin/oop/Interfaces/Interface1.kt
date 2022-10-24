package oop.Interfaces

fun main(){

    var restaurant:Resuturant = LocalRestaurant()
    restaurant.provideFood()

    var restaurant1:Resuturant = FancyRestaurant()
    restaurant1.provideFood()


}

interface Resuturant{

    fun provideFood()
    fun provideBill()
}

class LocalRestaurant:Resuturant{
    override fun provideFood() {
        println("Your local restuart provide food")
    }

    override fun provideBill() {
        println("Here is your BIll 43$")
    }
}
class FancyRestaurant:Resuturant{
    override fun provideFood() {
        println("Your Fancy restaurant provide food")

    }

    override fun provideBill() {
        println("Here is your BIll 99$")
    }

}

