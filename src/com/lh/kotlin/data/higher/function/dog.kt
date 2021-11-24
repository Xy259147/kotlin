package higher.function

// 定义数据类
data class dog(var name: String, var kind: String, var hight: Int, var address: String)

// 创建list集合
var dogdatabase= listOf<dog>(
        dog("妞妞","萨摩耶",23,"北京"),dog("阿贵","田园犬",22,"伊拉克"),
        dog("二哈","哈士奇",21,"上海"),dog("撒狗","田园犬",6,"新疆"),
        dog("小Q","柴犬",15,"北京"),dog("卤蛋","贵宾犬",21,"新疆"),
        dog("妞妞1","不丹",14,"广州"),dog("卤鸡","藏獒",32,"河北"),
        dog("妞妞2","萨摩耶",26,"广州"),dog("冒菜","拉布拉多",44,"河北"),
        dog("老麻","哈士奇",28,"哈尔滨"),dog("阿花","拉布拉多",44,"北京")
)

// 扩展函数
fun List<dog>.findByHeight(hight: Int) {
    filter {
        it.hight < hight
    }.forEach(::println)
}