fun main(args: Array<String>) {
    val arr1 =arrayOf(13,"Students",12.4,'d')
    val arr2 = arrayOf<Int>(34,464,7889,905,677,7868,)
    val arr3 =arrayOf<String>("John","Luke","Matthew")

    println(arr1[1])
    println(arr2[2])
    println(arr3[2])
// modification of an array
    arr1[0] = 25
    println(arr1[0])
    arr3[0] = "Dalot"
    println(arr3[0])

    // using the set function
    val fruits = arrayOf("Peaches","Melons","Avocados","Kiwi","Mangoes","Apples","")
    fruits.set(1,"Pineapple")
    println(fruits[1])
    fruits.set(0,"Berry")


    //using the get function
    val cars = arrayOf("Honda","Mazda","Toyota","Subaru")
    println(cars[0])
    println(cars.get(0))

    val employees = arrayOf<String>("Marshall","Duckworth","Cole","Parish","Lupe","GhostfaceKillah")
    employees.set(0,"M&M")
    println(employees[0])
    println(employees.get(4))
}