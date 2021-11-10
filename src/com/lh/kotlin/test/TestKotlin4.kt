package com.lh.kotlin.test

/**
 * @author liao hua
 * @date 2021/11/10 15:24
 */
fun main(args: Array<String>) {
  var str: String = """
    %多行字符串
    %菜鸟教程
    |多行字符串
    |Runoob
  """

  println(str.trimMargin("%"))
}