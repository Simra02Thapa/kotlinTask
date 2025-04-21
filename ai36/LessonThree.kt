package com.example.ai36

fun  main(){
    println("Hello World")

    //variable types
    // declare variable


    var name = "Simran" //mutable
    name = "Madhu"
    println(name)

    //( val is immutable)
    val age : Int = 10
    //roll = 10

    //mutable variable
    var firstName = "Simran"   //dynamic variable
    var lastName = "Thapa"
    println("$firstName $lastName")   //Concatination i.e space le jodne
    println("${firstName.length} $lastName")   //for property of variable {}

//Data types
    val a: Int = 5                // Int
    val b: Double = 5.99    // Double
    val c: Char = 'D'          // Char
    val d: Boolean = true     // Boolean
    val e: String = "Hello"      // String
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
//type conversion
//To convert a numeric data type to another type, you must use one of the following functions: toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar():

    val x: Int = 5
    val y: Long = x.toLong()
    println(y)
//String datatype
    var s: String = "Hello World"
    var i: Int  = s.length
    var z: Boolean = s.equals("Hello world")
    var username: String = "  Softwarica  "
    println(username.trim())
    println(s)
    println(i)
    println(s.isEmpty())
    println(s.lowercase())
    println(s.uppercase())
    println(s)

}