package com.lh.kotlin.test

/**
 * @author liao hua
 * @date 2021/11/10 15:08
 */
fun main(args: Array<String>) {
  // arrayOf 创建数组(有装箱操作)
  var array = arrayOf(1, 2, 3)
  // 使用工厂函数创建数组
  var array1 = Array(3, {i -> i * 2})
  // intArrayOf 创建数组（省略装箱操作）
  var array2: IntArray = intArrayOf(2, 3, 4)

}