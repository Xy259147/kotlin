package com.lh.kotlin

fun main(args: Array<String>) {
  // 集合
  val listOf = listOf<String>("hello", "world", "hello world", "welcome", "goodbye")
  println("------常规做法-----")
  for (item in listOf) {
    println(item)
  }
  println("------使用when-----")
  when {
    "world" in listOf -> println("world in collection")
  }
  println("------过滤-------")
  listOf.filter { it.length > 5 }.map { it.toUpperCase() }.sorted().forEach { println(it) }
}