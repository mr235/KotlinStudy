package basic_syntax
import basic_syntax.localVariables
import org.junit.Assert
import org.junit.Test

class basic_syntax_test {
//    fun sum(a: Int, b: Int): Int {
//        return a + b
//    }

    @Test fun sum() {
        Assert.assertEquals(5, basic_syntax.sum(1, 4))
    }
    @Test fun sum2() {
        Assert.assertEquals(5, basic_syntax.sum2(1, 4))
    }
    @Test fun printSum() {
        basic_syntax.printSum(1, 4)
    }
    @Test fun printSum2() {
        basic_syntax.printSum2(1, 4)
    }
    @Test fun localVariablesTest() {
        localVariables()
    }
    @Test fun stringTemplatesTest() {
        stringTemplates()
    }
}