package classes_objects.classes

import javax.swing.text.Element
import javax.swing.text.View

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
// 如果主类有主构造函数，子类必须初始化父类
class Derived(p: Int) : Base(p)

// 如果子类没有主构造函数，子类的次构造函数都要初始化父类
abstract class MyView : View {
    constructor(element: Element) : super(element)
}

// 在kotlin 所有不被open修饰的类都是finial的

// kotlin中覆写必须写override，被覆写的方法必须是open的
// 如果不是覆写，子类不能与父类有相同签名的方法（未被private修饰）
// 被override修饰的方法，是open的，如果不想被覆写，用finial修饰
open class 车 {
    open fun run(){
        println("车跑了")
    }
    fun xiangLaba(){
        println("鸣笛")
    }
}

open class Jeep : 车() {
    override fun run(){
        super.run()
        println("Jeep车跑了")
    }
    open fun laDongXi() {
        println("Jeep车拉东西")
    }
}

class SupperJeep : Jeep() {
    override fun run() {
        super.run()
    }
}

// kotlin中有覆写字段的概念，可以修改字段的值、getter、setter方法
// 可以把val的属性覆写成var的，不可以把var的属性覆写成val
open class Foo {
    open val x: Int
        get() {return 5}

    open fun f(){
        println("Foo.f()")
    }
}

class Bar1 : Foo() {
    override val x: Int
        get() = super.x + 8
}

class Bar2 : Foo() {
    override var x: Int = 0
        get() = super.x + 8
}

// 内部类可以通过 supper@{外部类名字}.外部类方法() 的方式调用外部类父类方法
// 内部类可以通过 this@{外部类名字}.外部类方法() 的方式调用外部类方法
class Bar3 : Foo() {
    override fun f() {
        super.f()
        println("Bar3.f()")
    }
    override val x: Int
        get() = 15

    inner class Baz {
        fun f() {
            println("Baz.f()")
        }
        fun g() {
            f()
            this@Bar3.f()
            super@Bar3.f()
            println(x)
        }
    }
}

open class A {
    open fun f() {
        println("A")
    }

    fun a() {
        println("a")
    }
}

interface B {
    fun f() {
        println("B")
    }
    fun b() {
        println("b")
    }
}

// kotlin不同父类中不能有同名同参，但返回参数类型不一样的方法
class C() : A(), B {
    override fun f() {
    }
}

// kotlin中没有static方法，一般用包中的方法