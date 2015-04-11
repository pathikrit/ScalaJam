object B extends Solver {
  import in._
  override def inputFile = "B-small-attempt3.in"

  override type Input = List[Int]

  override def parseInput = List.fill(nextInt)(nextInt)

  implicit class RichList[A](l: List[A]) {
    def -(elem: A): List[A] = l match {
      case Nil => Nil
      case x :: xs if x == elem => xs
      case x :: xs => x :: (xs - elem)
    }
  }

  override def apply(input: Input): Int = solve(input, input.max)

  def solve(input: Input, depthRemaining: Int): Int = {
    val worst = input.max
    if (worst <= 3) {
      worst
    } else if (depthRemaining < 0) {
      100000
    } else {
      val specials = for {
        i <- 1 to worst/2
      } yield solve((input - worst) :+ (worst - i) :+ i, depthRemaining - 1)
      worst min (1 + specials.min)
    }
  }
}
