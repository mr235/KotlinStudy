package classes_objects

import org.junit.Test

class PropertyAndFieldTest {
    @Test fun copyAddressTest() {
        val address = Address()
        address.name = "中关村"
        address.street = "上地三街"
        address.city = "北京"
        val copyAddress = copyAddress(address)
        copyAddress.stringRepresentation = "aabbaaaaaaaaa"
        println(copyAddress)
        println(copyAddress.stringRepresentation)
    }
}