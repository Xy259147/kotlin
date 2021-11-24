package godeep

/**
 * 人员类
 */
class Person constructor(username: String) {

  private var username: String

  private var age: Int

  private var address: String

  init {
    // 初始化值
    this.username = username
    this.age = 20
    this.address = "四川"
  }
  // 在类中对构造方法为secondary 构造方法
  // 非常重要：一个secondary  构造方法必须直接或间接的调用 primary构造方法
  constructor(username: String, age: Int): this(username) {
    println(username + " , " + age)
    this.username = username
    this.age = age
    this.address = "成都"
  }

  constructor(username: String, age: Int, address: String): this(username, age) {
    this.address = address
  }

  fun printInfo() {
    println("username: ${this.username}, age: ${this.age}, address: ${this.address}")
  }

}

fun main(args: Array<String>) {
  var person = Person("张三")
  var person1 = Person("李四", 30)
  var person2 = Person("王二", 40, "双流")
  person.printInfo()
  person1.printInfo()
  person2.printInfo()
}