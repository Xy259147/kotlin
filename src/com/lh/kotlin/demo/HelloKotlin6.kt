package com.lh.kotlin

/**
 * 数组
 */
fun main(args: Array<String>) {
    var array: IntArray = intArrayOf(1,2,3,5)
    // 遍历数组
    for (item: Int in array) {
        println(item)
    }
    println("--------")
    // 下标遍历 indices 获取数组索引范围（返回数组的索引区间）
    for (i: Int in array.indices) {
        println("array【$i】 = ${array[i]}")
    }
    println("--------")
    // 同时遍历索引和数组值 (方法返回一个Iterable对象，该对象的所有元素都是IndexedValue.)
    for (Iterable in array.withIndex()) {
        println("array[${Iterable.index}] = ${Iterable.value}")
    }
    println("--------")
    for ((index, value) in array.withIndex()) {
        println("array[${index}] = $value")
    }
}