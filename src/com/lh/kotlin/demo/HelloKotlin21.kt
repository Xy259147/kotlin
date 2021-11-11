/**
 * 延迟初始化
 * @author liao hua
 * @date 2021/11/11 16:19
 */
// kotlin在创建实例时，对于一个类中的成员变量必须赋初值
// 解决方法；给属性设置lateinit
/**
 * 1.kotlin 要求非空类型的属性必须要在构造方法中初始化
 * 2.有时，这种要求不太方便，比如可以通过依赖注入或是单元测试情况下进行属性的赋值
 * 3.通过lateinit 关键字标识属性为延迟初始化，需要满足以下几个条件：
 *  3.1：lateinit 只能用于类体中声明的var 属性上，不能用在 primary constructor(主构造)声明的属性上
 *  3.2：属性不能用于自定义的get、set方法
 *      例如：var name: String 必须设置
 *           var name: String？ 无法设置
 *  3.3：属性需要为非空，且不能是原生数据类型
 *
 */
class TheClass{
    lateinit var name: String

    fun init() {
        this.name = "zhansan"
    }
    fun print() {
        println(this.name)
    }
}

fun main(args: Array<String>) {
    var clazz = TheClass();
    clazz.init()
    clazz.print()
}