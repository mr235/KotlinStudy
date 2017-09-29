package idioms

import java.nio.file.Files
import java.nio.file.Paths

fun arrayOfMinusOnes(size: Int): IntArray
        = IntArray(size).apply { fill(20) }

class Turtle {
    fun penDown() = println("按下笔")
    fun penUp() = println("抬起笔")
    fun turn(degrees: Double) = println("转$degrees°")
    fun forward(pixels: Double) =
            if (pixels > 0) println("向前画${pixels}像素")
            else if(pixels.equals(0)) println("停笔不动")
            else println("向后画${pixels}像素")
}

fun java7WithResources() {
    val stream = Files.newInputStream(Paths.get("src/main/kotlin/idioms/idioms.kt"))
    stream.buffered().reader().use { reader ->
        println(reader.readText())
    }
}

class Person(id: Int, name: String)
// TODO 怎么覆写toString方法，这种写法怎么取id的值

fun useClass() {
    val list = ArrayList<Person>()
    list.add(Person(1, "张三"))
    list.add(Person(2, "李四"))
    list.add(Person(3, "王五"))
    list.forEach{ println(it) }
}