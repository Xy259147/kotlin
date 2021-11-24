package godeep

/**
 * 对象声明 object declaration
 * @author liao hua
 * @date 2021/11/11 10:46
 */
object MyObject {
    fun method() {
        println("object declaration")
    }
}

// companion object 伴生对象：随着类的创建而创建的对象，名称可省略，如果不提供伴生对象名称，那么编译器会提供一个默认名称 Companion
// 在kotlin 中，与java不同的是，kotlin是没有显式的提供static 方法的
// 在大多数情况下，kotlin推荐的做法是使用包级别的函数来作为静态方法
// kotlin 会将包级别的函数作为静态方法
// 一个类中只允许有一个伴生对象
// 注意：虽然伴生对象的成员看起来像是Java中的静态成员，但在运行期，他们依旧是正式对象的实例成员
// 在jvm上，可以将伴生对象的成员真正生成为类的静态方法与属性，这是通过@JvmStatic 注解来实现的
// 伴生对象在编译后会生成一个静态内部类
// 例：
class MyTest{
    // 伴生对象
    companion object MyObject{
        var a: Int = 100
        //@JvmStatic
        fun method() {
            println("godeep.method invoked")
        }
    }
}

class D{
    companion object {
        // 编译后会转换成真正的静态方法
        @JvmStatic
        fun foo() {

        }

        fun bar() {

        }
    }
}

fun main(args: Array<String>) {
    MyObject.method()

    println("=============")
    // 伴生对象调用
    MyTest.method()

    println("=============")
    MyTest.method() // 类似于静态方法，kotlin中没有静态方法
    println(MyTest.a)
}