fun main(args: Array<String>) {
    val child1 = Child()
    child1.myfunction()
    val dog1 = Dog("peach",10)
    dog1.woof()
    val cat1 = Cat("White",3)
    cat1.meow()
    val player = Footballer("Messi",35,"Arsenal")
    player.baller()
    val player1 = Volleyballer("Iniko",25,"Gor")
    player1.baller2()
}
open class Parent(){
    val x =5
}
class Child: Parent(){
    fun myfunction(){
        println(x)
    }
}
open class Animal(val colour:String,val age:Int){
    init {
        println("Colour is $colour")
        println("Age is $age")
    }
}
class Dog(colour: String,age: Int): Animal(colour,age){
    fun woof (){
        println("The dog woofs")
    }
}
class Cat(colour: String,age: Int): Animal(colour,age){
    fun meow(){
        println("The cat makes meow sound")
    }
}
class Cow(colour: String,age: Int):Animal(colour,age){
    fun moo(){
        println("The cow moos")
    }
}
class Horse(colour: String,age: Int):Animal(colour,age){
    fun neigh(){
        println("The horse neighs")
    }
}
open class Sportman(val name:String,val age: Int){
    init {
        println("Name is $name")
        println("age is $age")
    }
}
class Footballer(name: String,age: Int,club:String):Sportman(name,age){
    fun baller(){
        println("I am a footballer playing for Arsenal")
    }
}
class Volleyballer(name: String,age: Int,club: String):Sportman(name,age){
    fun baller2(){
        println("I am a volleyballer playing for Gor")
    }
}




