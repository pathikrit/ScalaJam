object A extends Solver(inputFile = "A-small-attempt2.in") {
  override type Input = String
  override type Output = Long

  override def read = {
    import scanner._
    next
  }

  implicit def longToString(l: Long) = l.toString

  override def apply(input: Input) = input.toLong match {
    case n if n <= 19 => n
    case n if n%10 == 0 => 1 + apply(n - 1)
    case n if !(input startsWith "1") => (n%10) + apply((10*(n/10) + 1).toString.reverse)
    case n if !(input endsWith "1") => (n%10) - 1 + apply(10*(n/10) + 1)
    case n if input.tail.init.toLong == 0 => 1 + apply(n - 1)
    case n =>
      val (l, r) = input splitAt (input.length/2)
      val next = l + ("0" * (r.length - 1) + "1")
      val reversed = next.reverse
      val didReverse = if (next == reversed) -1L else 0
      r.toLong + didReverse + apply(reversed)
  }
}
