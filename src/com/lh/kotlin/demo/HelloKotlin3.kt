package com.lh.kotlin

/**
 * 流程控制
 * @author liao hua
 * @date 2021/11/3 17:00
 */
fun main(args: Array<String>) {
    var x = 10
    var y = 20

    var min: Int
    var max: Int
    // 类似java
//    if (x > y) {
//        max = x
//        min = y
//    } else {
//        max = y
//        min = x
//    }
    // 简化
    max = if (x > y) x else y
    min = if (x > y) y else x

    println("最大值为:$max,最小值为:$min")

}