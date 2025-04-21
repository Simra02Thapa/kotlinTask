package com.example.ai36

//List
fun main() {
    val numbers: List<String> = listOf("one", "two", "three", "four")
    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\" ${numbers.indexOf("two")}")

//Immutable list
    val lst = listOf("one", "two", "three")
    println("Mutable List")
    for (i in lst.indices) {
        println(lst[i])
    }
    println()


//Mutable list
    val mutableLst = mutableListOf ("one","two", "three")
    mutableLst.add("Four")
    println("Immutable List")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }

//Set
    val number = setOf(1,2,3,4)
    for(elements in numbers){
        println(elements)
    }
    val numbersBackwards = setOf(4,3,2,1)
    println("The sets are equal: ${number == numbersBackwards}")

//Map
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beojing",
        "India" to "New Delji"
    )
    println("All keys : ${countriesCapitals.keys}")
    println("All values : ${countriesCapitals.values}")
    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")

//Example : Immutable map
    val studentMarks = mapOf(
    "ram" to 45,
    "shyam" to 45,
    "hari" to 45,
    "gita" to 45,
    )
    println("Enter student name:")
 //   val input : String = readln().lowercase()
  //  println(studentMarks[input])

//Mutable map
val studentsMarks = mutableMapOf(
    "ram" to 45,
    "shyam" to 45,
    "hari" to 45,
    "gita" to 45,

)
studentsMarks["ram"] = 60
//studentMarks.put.("sabin",80)
println("Enter student name: ")
val input: String = readln().lowercase()
println(studentMarks[input])
}
