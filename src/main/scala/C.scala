object C extends Solver {
  import in._
  override def inputFile = "C.in"

  override type Input = (Int, Int, String)

  override def parseInput = (nextInt, nextInt, skipLine(nextLine))

  override def apply(input: Input) = input
}
