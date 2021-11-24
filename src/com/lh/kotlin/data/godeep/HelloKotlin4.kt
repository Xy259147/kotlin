package godeep

import java.lang.NumberFormatException

/**
 * @author liao hua
 * @date 2021/11/4 14:54
 */
fun main(args: Array<String>) {
    println(convert2Int("ab") ?: "非法字符串")
    pringMultiply("2", "3")
}

fun convert2Int(str: String): Int? {
    try{
        return str.toInt()
    }catch (ex: NumberFormatException) {
        return null
    }
}

fun pringMultiply(a: String, b:String) {
    var a2Int = convert2Int(a)
    var b2Int = convert2Int(b)
    if (a2Int != null && b2Int != null) {
        println("$a2Int * $b2Int = ${a2Int * b2Int}");
    } else {
        println("param not int")
    }
}