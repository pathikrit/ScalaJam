object C extends Solver {
  import in._
  override def inputFile = "C.in"

  override type Input = String

  override def parseInput = nextLine

  override def apply(input: Input) = input
}