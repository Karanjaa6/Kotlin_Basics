import kotlin.math.cbrt

fun main(args: Array<String>) {
    for (a in 1..5){
        println("$a")
        if (a==3 ){
            println("I am terminating the loop")
            break
        }
    }
}