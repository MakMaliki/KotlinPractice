
fun main(args: Array<String>) {

//  var randomInt = setOf(42.55,55,66.77,77.32,88,99,22,33,44.5,1)
//
//  var subset = randomInt.filter { it in 0..50 }
//
//
//  var names = listOf("Malik","Hakim","Habib","Jawad","Nawab")
//
//  var sortedList = names.sortedBy { it[it.length-1] }
//  println(sortedList)

  //println(subset)

  var numbers = listOf(10, 14, 13, 11, 122, 88, 9, 92, 23, 43, 56)

println(numbers)
 var newNumbers= numbers.map {
    if (it %2 ==0){
      it*2
    }else{
      it/2
    }
  }.filter { it>55 }
  println(newNumbers)

}