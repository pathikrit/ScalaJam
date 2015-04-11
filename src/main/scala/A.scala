object A extends Solver {
  import in._
  override def inputFile = "A.in"

  override type Input = String

  override def parseInput = skipLine(nextLine)

  override def apply(input: Input) = input
}
