import A.Foo

object A {
  trait Foo {
    override def toString = "Foo"
  }
  object Foo {
    implicit val list = List(new Foo{})
  }
}

object TestImplicitly extends App {
//  implicit val l =

  println(implicitly[List[Foo]])
}
