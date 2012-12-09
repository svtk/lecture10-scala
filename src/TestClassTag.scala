import reflect.ClassTag

object TestClassTag extends App {
  trait MyClass[T] {
    def getT: T
  }

  def foo[T : ClassTag](mc: MyClass[T]): Array[T] =
    Array(mc.getT)

  def test[T: ClassTag](mc: MyClass[T]) {

    println(implicitly[ClassTag[T]])

    val array = foo(mc)
    println(array(0))
  }

  class MyConcreteClass extends MyClass[Int] {
    override def getT = 42
  }
  val c = new MyConcreteClass
  test(c)

  test(new MyClass[String] {
    def getT: String = "aaa!"
  })

  def incorrect[R](mc: MyClass[R]) {
//    test(mc)
  }
}
