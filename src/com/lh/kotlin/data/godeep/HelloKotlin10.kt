package godeep

/**
 * 转义符号 (""" """) 原样输出
 */
fun main(args: Array<String>) {
  var a: String = "hello \n world"
  println(a)
  var b: String = """ 萨达达\\n """
  println(b)
}