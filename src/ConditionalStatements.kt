import java.util.Scanner
fun main(args: Array<String>) {
    val age = 56
    if (age < 18) {
        println("Go back home kiddo")

    } else {
        println("Welcome, it's going to be hard. ")

    }
    // val number = 45
    // if (number == 1) {
    //    println("Oops, the pilot flew away!")

    //   } else if (number == 2) {
    //    println("Oops , again, don't worry you'll get him next time")

    //  } else if (number == 3) {
    //      println("Seems like you were lucky lot")
    //  } else {
    //     println(" Enter a valid number akh")
    //   }
// when statements
    //var y = 1
    // when(y){
    //  1 -> println("Oops, the pilot flew away!")
    //   2 -> println("Oops , again, don't worry you'll get him next time")
    //   3 -> println("Seems like you were lucky lot")
    //   else -> println("Enter a valid number akh")
    // }
    val read = Scanner(System.`in`)
    println("What is your weight in kilograms? ")
    val weight = read.nextFloat()
    println("What is your height in metres? ")
    val height = read.nextFloat()
    var BMI = weight / (height * height)
    println(BMI)
    if (BMI < 18) {
        println("You are underweight")
    }else if (BMI > 18 - 25) {
        println("You are within normal weight parameters")

    }else if (BMI >25-30) {
        println("You are overweight")
    }else if (BMI>30){
        println("you are obese")
    }else {
        println("Enter a valid number")
    }



}
