package Kotlinbook

fun main(){

//    var result:Int? =32
//
//    println(result?.plus(1))
//
//
//    println(result!!+1)


    //Getting Value from a Null
    var authorName:String? = "Malik"

    var nameLength = authorName?.length


    var nameLength2 =0

    authorName?.let {
        nameLength2 = authorName.length
    }

    println(nameLength2)


    //ELVIS OPERATOR

    var middleName: String? = null

    var nullAbleInt:Int? =10

    var mustHaveResult = if (nullAbleInt!=null) nullAbleInt else 0

    val mustHaveResult2 = nullAbleInt?:0


}