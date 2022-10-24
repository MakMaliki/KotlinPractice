package oop.principles

fun main(){

    val pug:Dog = pug("Pug")
    pug.play()
    pug.run()
    pug.bark()


    val chihuahua:Dog = Chihuahua("Chihuahua")
    chihuahua.play()
    chihuahua.run()
    chihuahua.bark()

    val bassetHound:Dog = BassetHound("Bassethound")
    bassetHound.play()
    bassetHound.run()
    bassetHound.bark()




}

abstract class Dog(name:String){

    abstract fun run()
    abstract fun play()
    abstract fun bark()
}

class pug(val name:String):Dog(name){
    override fun run() = println("$name can Run")
    override fun play() = println("$name can Play")
    override fun bark() = println("$name can't Bark")
}

class BassetHound(val name: String):Dog(name){
    override fun run() = println("$name can't Run")
    override fun play() = println("$name can Play")
    override fun bark() = println("$name can Bark")
}
class Chihuahua(val name: String):Dog(name){
    override fun run() = println("$name can Run")
    override fun play() = println("$name can't Play")
    override fun bark() = println("$name can Bark")
}