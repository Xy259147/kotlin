package higher.function

fun main(args: Array<String>) {
    // maxBy: 求最大值
    println(dogdatabase.maxBy({ it.hight }))
    println("--------")
    // minBy: 求最小值
    println(dogdatabase.minBy { it.hight })
    // filter：过滤
    println("--------")
    println(dogdatabase.filter { (it.hight > 40) and (it.address == "北京") })
    // map: 把某个属性映射成新的集合
    println("--------")
    println(dogdatabase.map {
        it.name
    })
    // any: 判断集合中是否包含某个值
    println("--------")
    println(dogdatabase.any {
        it.name == "二哈"
    })
    // count: 统计满足条件的数据
    println("--------")
    println(dogdatabase.count {
        (it.hight > 40)
    })
    // find: 查找满足条件的第一条数据
    println("--------")
    println(dogdatabase.find {
        it.name == "二哈"
    })
    // groupBy: 按照某个条件分组
    println("--------")
    // 按照地址进行分组，并打印地址为北京的人员
    dogdatabase.groupBy {
        it.address
    }.get("北京")?.forEach { println(it.toString())}
    println("----扩展函数编程----")
    //扩展函数调用
    dogdatabase.findByHeight(20)
}