package idioms

import org.junit.Test

class idioms_test {
    @Test fun arrayOfMinusOnesTest() {
        val ints = arrayOfMinusOnes(5)
        for (item in ints) {
            println(item)
        }
    }

    @Test fun withTest() {
        val myTurtle = Turtle()
        with(myTurtle) {
            penDown()
            for (i in 1..4) {
                forward(100.0)
                turn(90.0)
            }
            penUp()
        }
    }

    @Test fun java7WithResourcesTest() {
        java7WithResources()
    }

    @Test fun useClassTest() {
        useClass()
    }
}