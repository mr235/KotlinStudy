package basic_syntax
import org.junit.Assert
import org.junit.Test

class basic_syntax_test {
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }

    @Test fun sum() {
        Assert.assertEquals(5, sum(1, 4))
    }
    @Test fun sum2() {
        Assert.assertEquals(5, sum2(1, 4))
    }
    @Test fun printSum() {
        printSum(1, 4)
    }
    @Test fun printSum2() {
        printSum2(1, 4)
    }
    @Test fun localVariablesTest() {
        localVariables()
    }
    @Test fun stringTemplatesTest() {
        stringTemplates()
    }

    @Test fun maxOf() {
        Assert.assertEquals(4, maxOf(1, 4))
    }

    @Test fun maxOf2() {
        Assert.assertEquals(4, maxOf2(1, 4))
    }

    @Test fun maxOf3() {
        Assert.assertEquals(4, maxOf3(1, 4))
    }

    @Test fun myParseInt() {
        Assert.assertEquals(3, myParseInt("4"))
    }

    @Test fun printProduct() {
        printProduct("4", "a5")
    }

    @Test fun getStringLength() {
        Assert.assertEquals(3, getStringLength("abc"))
    }

    @Test fun useForLoop() {
        useForLoop(1)
    }

    @Test fun useForLoopIndex() {
        useForLoopIndex(1)
    }

    @Test fun useWhileLoop() {
        useWhileLoop(1)
    }

    @Test fun describe() {
        val describe = describe("Hello")
        println(describe)
    }
    @Test fun useRanges() {
        useRanges(1)
    }
    @Test fun iteratingRange() {
        iteratingRange(1)
    }

    @Test fun useCollections() {
        useCollections(1)
    }

}