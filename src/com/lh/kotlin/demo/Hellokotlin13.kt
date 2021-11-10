package com.lh.kotlin

// 案例12 简便方法
/**
 * 如果构造方法拥有注解或可见性修饰符，那么constructor 关键字不能省略，并且它位于修饰符后面
 */
class Student (private val username: String, private val age: Int, private val address: String) {
  fun printInfo() {
    println("username: ${username}, age: ${age}, address: ${address}")
  }
}
/**
 * 在kotlin对jvm编程中，如果primary 构造方法中所有参数都有默认值，那么kotlin 会在默认生成一个不带参数对构造方法
 * 这个不带参数对构造方法会使用这些参数的默认值，这样做的目的在于可以跟Spring等框架更好的集成
 */
class Student2 (val username: String = "初始值") {

}

fun main(args: Array<String>) {
  var student = Student("麻子", 50, "文星");
  student.printInfo()
}