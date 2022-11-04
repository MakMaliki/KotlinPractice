package ClassTypes

import kotlin.random.Random

fun main(){
//    var currentState = GameStates.STARTED
//
//    for (i in 1..3){
//        println(currentState)
//
//        currentState = changeState(currentState)
//    }


    val olympic = Olympic()
    val poitionMichelPhilips =5
    println( olympic.getMedalTypeByPosition(poitionMichelPhilips).name)
//    val poitionMichelPhilips =4
    println( olympic.getMedalPositionByType(OlympicMedals.NONE))


}

fun changeState(gameStates: GameStates):GameStates {
    return when(gameStates){
        GameStates.STARTED -> GameStates.PLAYED
        GameStates.PLAYED -> GameStates.GAMEOVER
        GameStates.GAMEOVER -> GameStates.STARTED
    }
}

enum class GameStates{
    PLAYED,
    STARTED,
    GAMEOVER
}


class Olympic{


    fun getMedalTypeByPosition(position:Int):OlympicMedals{
        return when(position){
            1 -> OlympicMedals.GOLDEN
            2 -> OlympicMedals.SILVER
            3 -> OlympicMedals.BRONZE
            else -> {
               OlympicMedals.NONE
            } } }


    fun getMedalPositionByType(medalType:OlympicMedals):Int{

     return   when(medalType){
            OlympicMedals.GOLDEN -> 1
            OlympicMedals.SILVER -> 2
            OlympicMedals.BRONZE -> 3
            OlympicMedals.NONE -> 4
        }
    }

}



enum class OlympicMedals{
    GOLDEN,
    SILVER,
    BRONZE,
    NONE
}