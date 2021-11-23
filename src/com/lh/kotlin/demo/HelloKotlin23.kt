/**
 * 扩展：extension
 * @author liao hua
 * @date 2021/11/22 11:08
 */
class ExtensionTest {
    // 加法
    fun add(a: Int, b: Int) =  a + b

    // 减法
    fun subtract(a: Int, b: Int) = a - b
}

// 扩展方法
fun ExtensionTest.multiply(a: Int, b: Int): Int = a * b

fun main(args: Array<String>) {
    var extensionTest = ExtensionTest();
    println(extensionTest.add(1, 2))
    println(extensionTest.subtract(2, 2))
    println(extensionTest.multiply(1, 2))

    // 输出 a
    myPrint(AA())
    // 输出 a （调用是由对象声明类型所决定的，而不是由对象的实际类型决定）
    // myPrint 参数类型是由AA 声明的，所以调用AA的a方法
    myPrint(BB())


    // 验证用BB类型声明
    myPrint1(BB())
}

/**
 * 扩展函数的解析是静态的
 *  1.扩展本身并不会真正修改目标类，也就是说它并不会在目标类中插入新的属性或方法
 *  2.扩展函数的解析是静态分发的，而不是动态的，即不支持多态，调用只取决于对象的声明类型
 *  3.调用是由对象声明类型所决定的，而不是由对象的实际类型决定
 */

// 举例
open class AA {

}

class BB: AA() {

}

// 扩展类AA的方法
fun AA.a() = "a"
// 扩展类BB的方法
fun BB.a() = "b"

fun myPrint(aa: AA) {
    // 输出a 方法
    println(aa.a())
}

fun myPrint1(bb: BB) {
    // 输出a 方法
    println(bb.a())
}

//// 验证
//fun main(args: Array<String>) {
//
//}
