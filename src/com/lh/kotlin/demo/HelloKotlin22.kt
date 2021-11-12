/**
 * 可见性 visibility (类似Java中public、private)
 * kotlin 提供4种可见性修饰符：private（私有）、public（公开）、protected（受保护的）、internal（内部）-> kotlin 特有的
 *
 * @author liao hua
 * @date 2021/11/12 16:11
 */

// 默认使用public 修饰
// internal 修饰符：只能在同一个模块种访问
// private只能在当前文件中使用
// 包下面的第一个函数称为顶层函数或顶层类
fun method() {

}

open class Clazz {
    private val b = 3
    private val c = 4
    private val d = 5
}