object MaxList extends App {

  val list : List[Int] = List(1, 2, 3)
  list.max

//  maxListUpBound(List(1, 2, 3))


  def maxListUpBound[T <: Ordered[T]]
        (elements: List[T]): T =
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListUpBound(rest)
        if (x > maxRest) x
        else maxRest
    }
























  def maxListImpParm[T](elements: List[T])
                       (implicit orderer: T => Ordered[T]): T =
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListImpParm(rest)(orderer) //(orderer) is explicit
        if (orderer(x) > maxRest) x
        else maxRest
    }

  println(maxList(list))
//  println(implicitly[runtime.RichInt => Ordered[runtime.RichInt]])


  def maxList[T](elements: List[T])
                (implicit orderer: T => Ordered[T]): T =
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxList(rest) // (orderer) is implicit
        if (x > maxRest) x // orderer(x) is implicit
        else maxRest
    }

  def maxList1[T <% Ordered[T]](elements: List[T]): T =
    elements match {
      case List() =>
        throw new IllegalArgumentException("empty list!")
      case List(x) => x
      case x :: rest =>
        val maxRest = maxList1(rest) // (orderer) is implicit
        if (x > maxRest) x // orderer(x) is implicit
        else maxRest
    }
}
