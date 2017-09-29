package basic_syntax
import org.junit.Assert
import org.junit.Test

class basic_syntax_test {
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }

    @Test fun sumTest() {
        Assert.assertEquals(5, sum(1, 4))
    }
    @Test fun sum2Test() {
        Assert.assertEquals(5, sum2(1, 4))
    }
    @Test fun printSumTest() {
        printSum(1, 4)
    }
    @Test fun printSum2Test() {
        printSum2(1, 4)
    }
    @Test fun localVariablesTest() {
        localVariables()
    }
    @Test fun stringTemplatesTest() {
        stringTemplates()
    }

    @Test fun maxOfTest() {
        Assert.assertEquals(4, maxOf(1, 4))
    }

    @Test fun maxOf2Test() {
        Assert.assertEquals(4, maxOf2(1, 4))
    }

    @Test fun maxOf3Test() {
        Assert.assertEquals(4, maxOf3(1, 4))
    }

    @Test fun myParseIntTest() {
        Assert.assertEquals(3, myParseInt("4"))
    }

    @Test fun printProductTest() {
        printProduct("4", "a5")
    }

    @Test fun getStringLengthTest() {
        Assert.assertEquals(3, getStringLength("abc"))
    }

    @Test fun useForLoopTest() {
        useForLoop(1)
    }

    @Test fun useForLoopIndexTest() {
        useForLoopIndex(1)
    }

    @Test fun useWhileLoopTest() {
        useWhileLoop(1)
    }

    @Test fun describeTest() {
        val describe = describe("Hello")
        println(describe)
    }
    @Test fun useRangesTest() {
        useRanges(1)
    }
    @Test fun iteratingRangeTest() {
        iteratingRange(1)
    }

    @Test fun useCollectionsTest() {
        useCollections(1)
    }

}