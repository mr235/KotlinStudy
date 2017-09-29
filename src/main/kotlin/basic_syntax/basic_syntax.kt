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

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else{
        return b
    }
}

// if 做为方法表达式，不用return
fun maxOf2(a: Int, b: Int) = if (a > b) a else b

fun maxOf3(a: Int, b: Int) =
        if (a > b){
            // return a // 错误
            a
        } else {
            b
        }

fun parseInt(str: String): Int? {
    return str.toIntOrNull();
}

fun myParseInt(str: String): Int? {
    val x = parseInt(str)
    return x;
}

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    } else {
        var str: String;
        if (x == null) {
            str = arg1
        } else {
            str = arg2
        }
        println("'$str' is not a number")
    }
}

fun getStringLength(obj: Any): Int? = if(obj is String) obj.length else null

fun useForLoop(arg: Int) {
    val items = listOf("apple", "banana", "kiwi")
    for (item in items)
        println(item)
}

fun useForLoopIndex(arg: Int) {
    val items = listOf("apple", "banana", "kiwi")
    for (index in items.indices)
        println("item at $index is ${items[index]}")
}

fun useWhileLoop(x: Any): Unit {
    val items = listOf("apple", "banana", "kiwi")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++;
    }
}

fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }

fun useRanges(x: Any) {
    val x = 10
    val y = 9
    if (x in 1 .. y + 1) {
        println("fits in range ${1 .. y + 1}")
    }
}

fun iteratingRange(x: Any) {
    for (i in 1..5) {
        print("$i ")
    }
    println()
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()
    for (i in 9 downTo 0 step 2) {
        print("$i ")
    }
}

fun useCollections(x: Any) {
    val items = listOf("apple", "avocado", "banana", "kiwi")
    for (item in items) {
        println(item)
    }
    println("------------------------")
    when {
        "banana" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    println("------------------------")
    items
    .filter { it.startsWith("a") }
    .sortedBy { it }
    .map { it.toUpperCase() }
    .forEach { println(it) }
}