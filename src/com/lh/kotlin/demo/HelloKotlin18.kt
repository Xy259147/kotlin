/**
 * 抽象类
 * @author liao hua
 * @date 2021/11/11 10:41
 */
open class BaseClass{
    open fun method() {

    }
}

// 抽象类
abstract class ChildClass: BaseClass() {
    // 如果父类是一个普通类，子类是一个抽象类。子类中的方法可以使用抽象方法override 父类中的具体方法
    override abstract fun method()
}