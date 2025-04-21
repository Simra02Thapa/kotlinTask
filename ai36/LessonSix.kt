package com.example.ai36

import android.icu.util.Output

//Operators
//Arithmetic operators
fun main(){
    var num1: Double = 10.6
    var num2: Double = 5.0
    var Output: Double = 0.0

    Output = num1 + num2
    println("num1 + num2 is $Output")
    Output= num1 - num2
    println("num1 - num2 is $Output")
    Output = num1 * num2
    println("num1 * num2 is $Output")
    Output = num1 / num2
    println("num1 / num2 is $Output")
    Output = num1 % num2
    println("num1 % num2 is $Output")

//Assignment operators
    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x+Y = $z")
    z += x
    println("z += x = $z")
    z -= x
    println("z *= x = $z")
    z *= x
    println("z /= x = $z")
    z %= x
    println("z %= x = $z")

//Unary Operator
    var number: Double = 7.6
    var isCheck: Boolean = true;
    println("+number = ${+number}");
    println("-number = ${-number}");
    println("++number = ${++number}");
    println("--number = ${--number}");
    println("!isCheck = ${!isCheck}");
    println(".......................")
    var result1:Double = 4.7
    println("results :$result1")

//when the result++ is executed, the original value is evaluated first and
// the value of result is increased only after that

    println("results++ :" + result1++)

//equality  and relational operators
    var a: Int = 5
    var b: Int = 5

    println("a == b :" + (a == b))
    println("a != b :" + (a != b))
    println("a < b :" + (a < b))
    println("a > b :" + (a > b))
    println("a >= b :" + (a >= b))
    println("a <= b :" + (a <= b))

//Conditional operators
    var number1: Int = 5
    var number2: Int = 8
    var number3: Int = 12
    var result: Boolean = false;

 /*conditional operators(&&)
    Output = (number1 > number2) && (number3 > number2)
    println(Output)

 //conditional operator($$)
    result = (number1 > number2)|| (number3 > number2)
    println(Output)


 */


}