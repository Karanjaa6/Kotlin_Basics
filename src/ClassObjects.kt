import javax.print.attribute.standard.PrintQuality

fun main(args: Array<String>) {
    val obj1 = Cars("Toyota","Supra","1997")
    val obj2 = Cars("Mazda","RX7","2008")
    val obj3 = Cars("BMW","M3","2004")
    println(obj1.model)
    println(obj2.brand)
    val person1 = Person("Mark",34)
    person1.voterEligibility()
    val person2 = Person("Tabby",15)
    person2.voterEligibility()
    val person3 = Person("Ethan",45)
    person3.voterEligibility()
    val student1 = Student("Kim","A")
    student1.promotion("A")
    val product1 = Product("sugar",400.0,5)
    val totalcost1 = product1.calculateTotalCost()
    println(totalcost1)
    val product2 = Product("THC",800.0,10)
    val totalcost2 = product2.calculateTotalCost()
    println(totalcost2)
}
class Cars(val model:String,val brand:String, val year:String){
    //val model = ""
}
class Person(val name:String,val age:Int){
    fun voterEligibility(){
        if (age<18){
            println("You can't vote")
        }else{
            println("You can vote")
        }
    }
}
class Student(val name: String,val grade:String) {
    fun promotion(grade: String) {
        if (grade > "A-B") {
            println("You have been promoted to the next class")
        } else {
            println("You do not qualify for the promo")
        }
    }
}
class Product(
    val name: String,
    val price:Double,
    val quantity: Int
) {
    fun calculateTotalCost(): Double {
        return price * quantity

    }
}



