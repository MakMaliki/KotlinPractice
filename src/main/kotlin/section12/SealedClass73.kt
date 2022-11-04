package section12

class SealedClass73 {
}

//Sealed Class
//Abstract class , with restrict class file hirarchy


fun getResult(result:Result1){
    return when(result){
        is Success -> {
            println(result.dataFetched?:"Ensure you start fetching")
        }
        is Error -> {
            println(result.exception.toString())
        }
        is Loading -> {
            println("Loading")
        }
        is NotLoading -> {
            println("Idle")
        }

        else -> {
            println("N/A")
        }
    }
}






object Repository1 {
    private var loadState:Result1 =NotLoading
    private var dataFetched:String? = null

    fun startFetch(){
        loadState = Loading
        dataFetched= "data"
    }

    fun finishedFetch(){
        dataFetched= "Downloaded All Data"
        loadState= Success(dataFetched)
    }

    fun error(){
        loadState = Error(exception =Exception("Exception"))
    }

    fun getCurrentState():Result1{
        return  loadState
    }

}
//A class which functionalities are not implemented as of now
sealed class Result1
data class Success(val dataFetched: String?) : Result1()
data class Error(val exception: Exception) : Result1()
object  NotLoading:Result1()
object Loading: Result1()
