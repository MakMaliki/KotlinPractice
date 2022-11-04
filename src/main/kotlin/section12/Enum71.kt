package section12
//Enum
//Enumerated Types To enumerate means to list items one by one
//

fun main(){
//    val input = Result.ERROR
//
//    getResult(input)

    Repository.startFetch()
    getResult(Repository.getCurrentState())

    Repository.finishedFetch()
    getResult(Repository.getCurrentState())

    Repository.error()
    getResult(Repository.getCurrentState())


}


fun getResult(result:Result){
    return when(result){
        Result.SUCCESS -> println("Successful Type")
        Result.ERROR ->  println("Error Type")
        Result.IDLE -> println("Idle Type")
        Result.LOADING -> println("Loading Type")
    }
}

enum class Result {
    SUCCESS,
    ERROR,
    IDLE,
    LOADING,
}

//Not create many instance of the Repository,
//It is like Singleton
object Repository {
    private var loadState:Result = Result.IDLE
    private var dataFetched:String? = null

    fun startFetch(){
        loadState = Result.LOADING
        dataFetched= "data"
    }

    fun finishedFetch(){
        loadState=Result.SUCCESS
        dataFetched= "Downloaded All Data"
    }

    fun error(){
        loadState = Result.ERROR
    }

    fun getCurrentState():Result{
        return  loadState
    }

}