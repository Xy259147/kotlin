package com.lh.kotlin.demo

/**
 * 继承
 * 在kotlin 中，所有类在默认情况下都是无法被继承的
 * 换句话说，在kotlin中，所有类默认情况下都是final的
 * 若需要被继承，则需要给类添加open关键字，
 * open 的含义与final相反
 */

open class Parent(name: String, age: Int) {

}
// 在kotlin使用继承需要显示的调用父类的构造方法
class Child(name: String, age: Int): Parent(name, age) {

}

open class Parent2(name: String) {

}
// 在kotlin中，如果一个类没有primary（主要的）构造方法，那么这个类的每个secondary（次要的）构造方法就需要通过
// super 关键字来初始化父类型，或是通过其他的secondary（次要的）构造方法完成该任务
// 不同的secondary（次要的）构造方法可以调用父类型不同的构造方法
class Child2: Parent2 {
  constructor(name: String): super(name) {

  }
}


fun main(args: Array<String>) {

}