package ReactiveProgrammingKotlin

import java.util.Observable

class SupportCode {

    fun main(){

        exampleOf("just"){
        //    val obserVale:Observable:<Int> = Observable.just(1)
        }

    }
    fun exampleOf(description:String,action:() ->Unit){
        println("\n The Example of $description")
        action()
    }
}