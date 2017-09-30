package basics.types

// Underscores in numeric literals (since 1.1)
// You can use underscores to make number constants more readable:

val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010

// === 对象比较
fun boxed() {
    val a: Int = 10000
    println(a === a) // print 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a;
    println(boxedA === anotherBoxedA) // print 'false'
}

// == 值比较，equals
fun boxed2() {
    val a: Int = 10000
    println(a == a) // print 'true'
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a;
    println(boxedA == anotherBoxedA) // print 'true'
}

fun operations() {
    /*
    shl(bits) – signed shift left (Java's <<) 左移
    shr(bits) – signed shift right (Java's >>) 右移
    ushr(bits) – unsigned shift right (Java's >>>) 无符号右移
    and(bits) – bitwise and 位与
    or(bits) – bitwise or 位或
    xor(bits) – bitwise xor 位异或
    inv() – bitwise inversion 位取反
    */
}

// Kotlin 中 array 存储的类型是不变的
fun arrays() {
    val array1 = arrayOf(1, 2, 3)
    for (item in array1)
        print("$item ")
    println()
    val array2 = arrayOfNulls<Int>(4)
    for (item in array2) {
        print("$item ")
    }
    println()
    // Another option is to use a factory function that takes
    // the array size and the function that can return
    // the initial value of each array element given its index:
    var asc = Array(5, { i -> (i * i).toString()})
    for (item in asc) {
        print("$item ")
    }
    println()
}

// 没有特殊字符
fun rawString() {
    val text = """
        ab\nc  de
        f   g\th  i
        """
    for (c in text) {
        print(c)
    }
}

fun stringTemplates() {
    val  i = 10
    val s = "i = $i"
    println(s)
    val s2 = "abc"
    val str = "$s.length is ${s.length}"
    println(str)
    val price = """${'$'}9.99  $"""
    println(price)
}
