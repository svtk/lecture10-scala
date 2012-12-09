import reflect.ClassTag

type B
type C[T]

object ContextAndViewBounds {

  //view bound
  def foo[A <% B](x: A) = x
  def foo1[A](x: A)(implicit f: A => B) = x

  //context bound
  def bar[A : ClassTag](x: A) = x
  def bar1[A](x: A)(implicit v: ClassTag[A]) = x
}
