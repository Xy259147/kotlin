package com.lh.kotlin

//区间（..）
fun main(args: Array<String>) {
  val a = 5
  val b = 10
  // 区间判断(在指定区间内)
  if (a in 2..b) {
    println("in the range")
  }
  // 区间判断(在指定区间外)
  if (b !in 2..a) {
    println("out of the range")
  }

  println("-------区间遍历------")
  for (i in 2..b) {
    println(i)
  }

  println("-------区间遍历------")
  for (i in 2.rangeTo(10)) {
    println(i)
  }

  println("-------步进(小到大)------")
  for (i in 2..10 step 2) {
    println(i)
  }

  println("-------步进(大到小)------")
  for (i in 10 downTo 2 step 2) {
    println(i)
  }
}