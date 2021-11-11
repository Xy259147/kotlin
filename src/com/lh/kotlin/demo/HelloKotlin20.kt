/**
 * 属性中真正存储属性值（事务本身）叫field，只能在get、set方法中使用
 * @author liao hua
 * @date 2021/11/11 15:35
 */
class ThePerson(address: String, name: String) {
    /**
     * (常量)只读属性满足条件：
     * 1.用val 声明
     * 2.只有get方法
     */
    val age: Int
        get() = 21
    /**
     * (变量)非只读属性满足条件：
     * 1.用var 声明
     * 2.有get、set方法
     */
    var address: String = address
        get() {
            println("get invoke")
            // field 代表事务本身，类似与内存地址
            return field
        }
        // value 是默认参数值
        set(value) {
            println("set invoke")
            // 通过value给事务本身赋值
            field = value
        }
    // 常规使用
    var name: String = name
        // 设置set、get方法访问级别，要与属性的访问级别一致
        private set

    /**
     * backing field 支撑字段（域）：表示属性实际存储值的目标，只能在一个属性的访问器中使用
     * backing property 支持属性
     */
}

fun main(args: Array<String>) {
    var person = ThePerson("上海", "张三")
    println(person.age)

    println(person.address)

    person.address = "北京"

    println(person.address)
}