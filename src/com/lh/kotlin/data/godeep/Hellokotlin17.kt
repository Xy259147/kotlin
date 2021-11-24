package godeep

/**
 * 实现
 * @author liao hua
 * @date 2021/11/11 10:32
 */
interface A {
    fun method() {
        println("godeep.A")
    }
}

open class B {
    open fun method() {
        println("godeep.B")
    }
}

class C: A, B() {
    override fun method() {
        // 调用类A中的method 方法
        super<A>.method()
        // 调用类B中的method 方法
        super<B>.method()
    }
}

fun main(args: Array<String>) {
    var c = C()
    c.method()
}