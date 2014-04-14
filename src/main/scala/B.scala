object B extends Solver {
  import in._
  override def inputFile = "B.in"

  override type Input = String

  override def parseInput = nextLine

  override def apply(input: Input) = input
}