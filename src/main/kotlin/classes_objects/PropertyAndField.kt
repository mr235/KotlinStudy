package classes_objects

import org.junit.Test

class Address {
    var name: String = ""
    var street: String = ""
    var city: String = ""

    // field 放在getter和setter里是属性的值
    // 它也可以作为普通变量使用，并不是关键字
    var stringRepresentation: String = ""
        get() {
            return field
        }
        set(value) {
            field = value
        }

    override fun toString(): String {
        return "Address[name=$name street=$street city=$city]"
    }
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    result.city = address.city

    return result
}

// const 关键字只满足以下三个条件：
// 1、在最顶层或是一个对象的成员(不知道第二种情况怎么使用)
// 2、用String或基本类型初始化
// 3、没有自定义的getter
const val SUBSYSTEM_DEPRECATED: String = "This subsystem is deprecated"

@Deprecated(SUBSYSTEM_DEPRECATED) fun foo(){}

class TestSubject {
    fun method() {
        println("TestSubject.method()")
    }
}

// kotlin中声明属性都是非null的，
// 需要声明非null的，使用lateinit关键字，这时就需要判断非空了
public class MyTest {
    lateinit var subject: TestSubject

    fun setup() {
        subject = TestSubject()
    }

    @Test fun test() {
        subject.method()
    }
}