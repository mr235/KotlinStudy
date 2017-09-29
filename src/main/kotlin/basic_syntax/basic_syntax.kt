package basic_syntax

// Defining functions

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a:Int, b:Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

//Defining local variables
fun localVariables() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment

    var x = 5 // `Int` type is inferred
    x += 1

    println("a = $a, b = $b, c = $c, x = $x")
}
// Comments

// This is an end-of-line comment

/* This is a block comment
   on multiple lines. */

fun stringTemplates() {
    var a = 1
    // simple name in template:
    var s1 = "a is $a"

    a = 2
    var s2 = "${s1.replace("is", "was")}, but now is $a"

    println("$s1\n$s2")
}



