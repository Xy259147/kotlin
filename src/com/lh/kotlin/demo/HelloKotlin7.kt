package com.lh.kotlin

// when 关键字
fun main(args: Array<String>) {
  println(myPrint("hello"))
  println(myPrint("world"))
  println(myPrint2("world"))

  // when 应用领域(直接获取结果集)
  var a = 11
  var result = when (a) {
    1, 3 -> 10
    2 -> 20
    in 6..10 -> 30
    else -> 0
  }
  println(result)
}

fun myPrint(str: String): String? {
  // 简写
  return when (str) {
    "hello" -> "HELLO"
    "world" -> "WORLD"
    "hello world" -> "HELLO WORLD"
    else -> "other input"
  }

//  when (str) {
//    "hello" -> return "HELLO"
//    "world" -> return "WORLD"
//    "hello world" -> return "HELLO WORLD"
//    else -> return "other imput"
//  }
}

fun myPrint2(str: String): String = when (str) {
  "hello" -> "HELLO"
  "world" -> "WORLD"
  "hello world" -> "HELLO WORLD"
  else -> "other input"
}