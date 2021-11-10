package com.lh.kotlin.test

/**
 * @author liao hua
 * @date 2021/11/10 15:48
 */
fun main(args: Array<String>) {
  // when 常规用法
  var a: Int  = 20
  when(a) {
    10 -> println("等于10")
    20 -> println("等于20")
    else -> println("都不满足")
  }
  // 检测是否存在某个区间
  when(a) {
    in 10..20 -> println("存在区间10~20")
    in 20..30 -> println("存在区间20~30")
    else -> println("都不满足")
  }
  // 判断是否存在某个集合中

  var lists = listOf<String>("大众", "宝马", "奔驰")
  when {
    "大众" in lists -> println("存在大众")
    "奔驰" in lists -> println("存在奔驰")
  }
}