import  java.util.Scanner
fun main(args: Array<String>) {
    println("Please type your name here: ")
    val  enteredName = readLine()
    println("You have entered your name as $enteredName")

    println("Please enter your age: ")
    val enteredAge =Integer.valueOf(readLine())
    println("You are $enteredAge years old .")


    val read =Scanner(System.`in`)
    println("Enter your Physics marks: ")
    val enteredMarks = read.nextInt()
    println("You got $enteredMarks in physics.")

    println("Please enter yuor BMI")
    val enteredBMI = read.nextFloat()
    println("your BMI is $enteredBMI")

    println("Enter a number: ")
    val numberUno = read.nextFloat()
    println("Enter another number: ")
    val  numberDos = read.nextFloat()
    val add = numberDos + numberDos
    val diff =numberDos - numberUno
    println("Your total is $add")
    println("Your total is $diff")



}