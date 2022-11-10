package extenstionFunction


fun main(){
    var list = mutableListOf(1,3,4,6)
    println(list)
    list.swap(0,2)

    println(list)
}

fun MutableList<Int>.swap(index1: Int,index2:Int){

    val tmp = this[index1]
    this[index1]=this[index2]
    this[index2] =tmp
}