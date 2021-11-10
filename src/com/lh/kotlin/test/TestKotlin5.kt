package com.lh.kotlin.test

/**
 * @author liao hua
 * @date 2021/11/10 15:28
 */
fun main(args: Array<String>) {
  // 输出指定区间值
  for (i in 1..5) println(i) // 输出 1，2，3，4，5
  println("----------------")
  for (i in 4..1) print(i) // 什么都不输出
  println("----------------")
  // 步长
  for (i in 1..10 step 2) println(i)
  println("----------------")
  // 反向步长
  for (i in 10 downTo 1 step 2) println(i)
  println("--------排除元素--------")
  for (i in 1 until 10) println(i) // 排除元素10

}