package godeep

/**
 * 继承-》方法的重写
 */

open class Fruit {
  // 如果父类的一个方法需要被重写，则该方法需要用open进行修饰
  open fun name() {
    println("fruit")
  }

  fun expirationDate() {
    println("1 month")
  }
}

// 如果一个子类重写类父类的一个方法，那么子类重写的这个方法必须使用override 进行修饰
class Apple: Fruit() {
  override fun name() {
    println("apple")
  }
}
// 如果某一个类中的方法不允许再被继承，那么可以使用final对该方法进行修饰
open class  Orange: Fruit() {
  final override fun name() {
    println("orange")
  }
}


fun main(args: Array<String>) {
  var apple = Apple()
  apple.name()
  apple.expirationDate()
}