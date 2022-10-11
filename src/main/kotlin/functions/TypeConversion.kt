package functions

class TypeConversion {

    fun main(args: Array<String>) {

        println("Please Enter a number")

        val number = readLine()?:""

        println("Convertet to Int${number.toInt()} new Type is${number::class.java}")

    }

    }