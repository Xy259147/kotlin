package com.lh.kotlin.test

/**
 * === 与 ==
 * @author liao hua
 * @date 2021/11/10 14:57
 */
fun main(args: Array<String>) {
  val a: Int = 10000
  val b: Int = 10000
  println(a === a) // true，值相等，对象地址相等
  println(a === b) // true，值相等，对象地址相等

  //经过了装箱，创建了两个不同的对象
  val boxedA: Int? = a
  val anotherBoxedA: Int? = b

  //虽然经过了装箱，但是值是相等的，都是10000
  println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
  println(boxedA == anotherBoxedA) // true，值相等
}