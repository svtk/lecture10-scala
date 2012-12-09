import reflect.ClassTag

object Arrays {

//  def first[T](x: Array[T]) = Array(x(0))

  //Array[Int]      int[]
  //Array[String]   String[]
  //Array[T]

  //IntArray        int[]
  //Array[Int]      Int[]


















  def first1[T](x: Array[T])
               (implicit m: ClassTag[T]) = Array(x(0))

  def first2[T : ClassTag](x: Array[T]) = Array(x(0))
  //context bounds
}
