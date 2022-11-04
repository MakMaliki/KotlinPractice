package section12

fun main(){
    val listOfItem = listOf("Malik","Hakim","Aziz","Jawad","Nawab")
    val finder = Finder(listOfItem)

    finder.findItem("Jamil"){
        if (it.isNullOrEmpty()){
            println("The item is not in the list")
        }else{
            println("The item is in the list")
        } }
}

class Finder(private val list:List<String>){
    fun findItem(element:String, foundItem:(element:String?)->Unit){
        val itemFoundList = list.filter { itemList->
            itemList==element
        }
        if(itemFoundList.isNullOrEmpty()) foundItem(null) else
            foundItem(itemFoundList.first())
    }
}




