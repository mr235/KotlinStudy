package classes_objects.classes

import org.junit.Test

class ClassesTest {
    @Test fun classCreateTest() {
        val invoice = Invoice()
        val customer = Customer("张三")
        println(invoice)
        println(customer)
    }
}