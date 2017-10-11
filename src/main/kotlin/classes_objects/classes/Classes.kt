package classes_objects.classes

class Invoice {
}

// 如果没有内容，可以不写{}
class Empty

// 可以有一个主构造函数
class Person constructor(firstName: String) {
}

// 可以有一个主构造函数
// 关键字 constructor 如果主构造函数没有注释和可见性修饰符可以省略
class Person2(firstName: String) {
}

// 初始化
class Customer(name: String) {
    init {
        println("Customer initialized with value ${name}")
    }
    var customerKey = name.toUpperCase()
}

// 不能被创建的类(私有构造函数)
class DontCreateMe private constructor() {}

// 没有声明父类的类，父类是Any(不是java.lang.Object)

open class Base(p: Int)

class Derived(p: Int) : Base(p)
