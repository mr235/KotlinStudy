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
