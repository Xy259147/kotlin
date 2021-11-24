package godeep

/**
 * 属性继承
 */
open class MyParent {
  // 如果某个类中的属性需要被继承，则需要使用open对该属性进行修饰
  open var name: String = "parent"
}

class MyChild: MyParent() {
  // 如果该属性继承父类，或者与父类同名，则需要使用override对该属性进行修饰
  override var name: String = "child"
}
// 使用constructor重写父类属性
class MyChild2(override var name: String): MyParent() {

}

open class MyParent3 {
  open fun method() {
    println("parent godeep.method")
  }
  open val name: String get() = "parent"
}

class MyChild3: MyParent3() {
  override fun method() {
    super.method()
    println("child godeep.method")
  }

  override val name: String get() = super.name + " and child"
}

/**
 * 继承关系：
 * 1.val 可以 override val
 * 2.var 可以 override val
 * 3.val 无法 override var
 * 本质上，val 相当于get方法，var 相当于get、set方法
 */

fun main(args: Array<String>) {
//  var myChild = MyChild()
//  println(myChild.name)

  var myChild3 = MyChild3()
  myChild3.method()
}