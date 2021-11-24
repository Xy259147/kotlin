package godeep

// 可以通过 as 设置导入包的别名
//import com.wecode.demo2.godeep.multiply
import godeep.multiply as multiplyAs

/**
 * @author liao hua
 * @date 2021/11/3 16:34
 */
fun main(args: Array<String>) {
    // 常量
    val a: Int = 1
    // 变量
    var b: Int
    b = 5
    var x = 10
    var y: Byte = 20
    x = y.toInt()
    println(x)

    // import 导入
    println(multiplyAs(100, 100))

    val m = intArrayOf(1, 2, 3)
    m.set(0, 4)
    for (i in m) {
        println(i)
    }

}