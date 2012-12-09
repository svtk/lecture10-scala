import math.Numeric.IntIsIntegral

object SpecializedMethods extends App {
  val ints = Set(1, 2, 3)
  ints.sum(IntIsIntegral)

  val strings = Set("a", "b", "c")

  println(strings.min)

//    implicit object stringNumeric
//      extends Numeric[String] {
//
//      override def plus(x: String, y: String) = x + y
//      override def zero = ""
//
//      def compare(x: String, y: String): Int = 0
//      def minus(x: String, y: String): String = ""
//      def times(x: String, y: String): String = ""
//      def negate(x: String): String = ""
//      def fromInt(x: Int): String = x + ""
//      def toInt(x: String): Int = 0
//      def toLong(x: String): Long = 0
//      def toFloat(x: String): Float = 0
//      def toDouble(x: String): Double = 0
//
//    }
//
//  println(strings.sum)

}
