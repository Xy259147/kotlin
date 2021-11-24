package godeep

/**
 * @author liao hua
 * @date 2021/11/4 16:05
 */
fun main(args: Array<String>) {
    println(convert2Uppercase("Hello World"))
    println(convert2Uppercase(2))
}

fun convert2Uppercase(str: Any): String?  {
    if (str is String) {
        return str.toUpperCase()
    }
    return null
}