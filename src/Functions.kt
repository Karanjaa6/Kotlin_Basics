fun main(args: Array<String>) {
    hello(name = "Ducky")
    hello(name = "Rza")
    hello(name = "Methodman")
    hello(name = "Raekwon")
    calculateAge(age = 23)
    calculateAge(age = 34)
    calculateAge(age = 45)
    calculateAge1(1999,2024)
    println( add(25.4,45.5))
    println(birthdayGreeting("Wick",36))
    println( rectangle(25.0,25.0))
    println(rectangle())
    println(person("Webb",34))
    println(bmicalculculator())
    println(circle())
}

        fun hello(name: String){
            println("Hello $name")
        }
        fun calculateAge(age:Int){
            println("You are $age years old.")
        }
        fun calculateAge1(birthyear:Int, currentyear:Int){
            println("You were born in the year $birthyear")
            println("We are in the year $currentyear")
        }

        fun add(num1: Double, num2:Double): Double {
            val summation = num1+num2
            return summation


        }
        fun birthdayGreeting(name: String,age: Int):String{
           val a = "Hey $name"
           val b = "You are $age years old"
           return "$a\n$b"

        }
        fun rectangle(length:Double=10.0,width:Double=10.0):Double{
            val area = length*width
            return area
        }
        fun person(name: String,age: Int,company:String="eMobilis"):String{
            val profile = "Employee's $name is of $age years old and and works at $company"
            return profile
        }
        fun bmicalculculator(height:Double=1.5,weight:Double=70.0):Double{
            val bmi = weight/(height*height)
            return bmi
        }
        fun circle(pi:Double=3.14,radius:Double=7.0):Double{
            val area =pi*(radius*radius)
            return area
        }
