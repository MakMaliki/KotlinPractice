package section12

fun main(){
    val listOfItem = listOf("Malik","Hakim","Aziz","Jawad","Nawab")
    val listOfIntItems = listOf(1,21,22,33,332)
    val finder1 = Finder1(listOfIntItems)

    finder1.findItem1( 23){
        if (it ==null){
            println("The item is not in the list")
        }else{
            println("The item is in the list")
        } }
}
class Finder1<T>(private val list:List<T>){
    fun findItem1(element: T, foundItem:(element:T?)->Unit){
        val itemFoundList = list.filter { itemList->
            itemList==element
        }
        if(itemFoundList.isNullOrEmpty()) foundItem(null) else
            foundItem(itemFoundList.first())
    }
}


