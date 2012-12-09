object ReifiedTypeConstraints extends App {

  def peek[A, C <: Traversable[A]](col: C) = (col.head, col)

  def peek[C, A](col: C)(implicit ev: C <:< Traversable[A]) = (col.head, col)

  println(peek(List(1, 2, 3)))

  println(implicitly[Int <:< Any])

















  Some(3).orNull : Any












  case class MySome[+A](a: A) {
    def cond = true

//        def orNull[A1 >: A]: A1 = if (cond) a else null
    def orNull[A1 >: A](implicit ev: Null <:< A1): A1 =
      if (cond) a else null
  }

  MySome(1).orNull : Any
  MySome("").orNull : String

//  sealed abstract class <:<[-From, +To]
//    extends (From => To)
//
//  implicit def conforms[A]: A <:< A =
//    new <:<[A,A] { def apply(x: A): A = x }
  // Null <:< String

  // <:<[Null, String]
  // <:<[String, String]
}









//fun foo[T](t: T) : T where Nothing : T {...}
