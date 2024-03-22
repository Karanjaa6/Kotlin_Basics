fun main(args: Array<String>) {
    1..10
    1.  rangeTo(10)
    val myVariables = 20..50
    for (variable in myVariables) {
        println(variable)
    }

    val  var2 = 11 .rangeTo(51)
    for (varr in var2){
        println(varr)
    }
    val alpha = 'A'..'Z'
    for (a in alpha){
        println(a)
    }
    val alpha2 = 'A'..'P'
    for (b in alpha2) {
        println(b)
    }
    val var4 = 10.downTo(1)
    for (one in var4){
        println(one)
    }

    val alphabet = 'z'.downTo('a')
    for (x in alphabet){
        println(x)
    }

    val marked = 1.rangeTo(10)
    marked.step(3)
    for (d in marked.step(3)){
        println(d)
    }

    for (e in marked.step(5)){
        println(e)
    }

    val varr6 = 200..500
    varr6.step(20)
    for (w in varr6.step(20)){
        println(w)
    }



}