package classes_objects.classes

import org.junit.Test

class ClassesTest {
    @Test fun classCreateTest() {
        val invoice = Invoice()
        val customer = Customer("张三")
        println(invoice)
        println(customer)
    }
    @Test fun overrideFunTest() {
        val jeep = Jeep()
        jeep.run()
        jeep.laDongXi()
    }

    @Test fun overridePropertyTest() {
        val foo = Foo()
        println(foo.x)
    }

    @Test fun innerClassTest() {
        var baz = Bar3().Baz()
        baz.g()
    }

    @Test fun overridSameMethodTest() {
        var c = C();
        c.f()
    }
}