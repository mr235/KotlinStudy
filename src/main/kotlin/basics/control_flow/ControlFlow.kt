package basics.control_flow

import basic_syntax.parseInt

fun ifExpression() {
    // 在kotlin中，if是表达式，
    // kotlin 没有三元操作符(条件?then:else) 因为if可以替代它
    // val max = if (a > b) a else b
    var a = 5
    var b = 6
    var max = a
    // 传统写法
    if (a < b) max = b

    // with else
    var max2: Int
    if (a > b)
        max2 = a
    else
        max2 = b

    // if 作为表达式 块中最后一条语句作为返回结果
    val max3 = if (a > b) a else b
    val max4 = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println("max4 = $max4")
}

fun whenExpression() {
    // when 和 if 一样，
    // 如果作为表达式，匹配到的分支，最后一条语句作为返回结果
    // 如果作为表达式，else分支必须有，除非编译器能证明有分支匹配
    var x = 1
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }

    //如果有多个条件处理同一结果，把条件写在一起，用逗号分隔
    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        else -> println("otherwise")
    }

    // 也可以用表达式作条件
    var s = "1"
    when (x) {
        parseInt(s) -> println("s encodes x")
        else -> println("s does not encode x")
    }

    // 也可以看是不是在一个范围内
    var validNumbers = 21..25
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
    var str = "1"
    val isString = str is String
    println(isString)

    // 感觉下面这种用法没啥用处(when 没有参数)
    when {
        x % 2 == 1 -> println("x 是奇数")
        x % 2 == 0 -> println("x 是偶数数")
        else -> println("x 不是整数，这就有点扯了")
    }
}

fun returnAtLabels1() {
    var ints = arrayOf(0, 1, 2, 3, 4)
    ints.forEach {
        if (it == 3) return
        println(it)
    }
    // return 返回的是方法的结果,lambda表达式
    println(ints)
}

fun returnAtLabels2() {
    var ints = arrayOf(0, 1, 2, 3, 4)
    ints.forEach lit@ {
        if (it == 3) return@lit
        println(it)
    }
    // return 加了标签就返回标签了
    println(ints)
}

fun returnAtLabels3() {
    // 习惯用法：如果返回lambda表达式，
    // return后+@调用lambda表达示的方法的名字
    var ints = arrayOf(0, 1, 2, 3, 4)
    ints.forEach {
        if (it == 3) return@forEach
        println(it)
    }
    println(ints)
}

fun returnAtAnonymousFunction() {
    // return如果是在匿名方法中，则返回的是匿名方法
    var ints = arrayOf(0, 1, 2, 3, 4)
    ints.forEach(fun(value: Int) {
        if (value == 3) return
        println(value)
    })
    println(ints)
}