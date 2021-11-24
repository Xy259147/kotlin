package godeep

/**
 * 可见性 visibility (类似Java中public、private)
 * kotlin 提供4种可见性修饰符：private（私有）、public（公开）、protected（受保护的）、internal（内部）-> kotlin 特有的
 *
 * @author liao hua
 * @date 2021/11/12 16:11
 */

// 默认使用public 修饰
// internal 修饰符：只能在同一个模块中访问（同一个src包路径下）
// private只能在当前文件中使用
// 包下面的第一个函数称为顶层函数或顶层类
fun method() {

}

open class Clazz {
    // 当前类中使用
    private val b = 3
    // 当前类中及其子类
    protected val c = 4
    // 当前模块中
    internal val d = 5
}

class subClass: Clazz() {
    fun method() {
        println("c 的值 $c")
        println("d 的值 $d")
    }
}

fun main(args: Array<String>) {
    var subClass1 = subClass();
    subClass1.method()
}