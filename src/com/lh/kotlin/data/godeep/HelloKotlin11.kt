package godeep

/**
 * 类 class
 */
class EmptyClass
// 在kotlin中，一个类可以有一个primary（基本的）构造方法以及一个或多个secondary（次要的）构造方法

// 例如：primary 构造方法是类头（class header）的一部分，它位于类头后面，可以拥有若干参数
// 如果 primary 构造方法没有任何注解或是可见性关键字修饰，那么constructor 关键字可省略
class MyClass constructor(username: String) {
  // 可以使用primary构造方法中的参数对类中成员变量赋值
  // 例如：
  private val username: String = username

  // 初始化代码块，给类对象的成员遍历赋初始值
  init {
    println(username)
  }
}

fun main(args: Array<String>) {
  //类对象实力化
  var myClass = MyClass("李四")
}
