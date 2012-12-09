import collection.immutable.TreeSet

object PreserveCollection extends App {

  val set = TreeSet(4, 2, 5, 1, 6, 3, 8)
  println(set)

  val filtered = set.filter(_ %2 == 0 )
  println(filtered)

  val doubled = set.map(_ + "!")
  println(doubled)
}
