object A extends Solver {
  import in._
  override def inputFile = "A-large.in"

  override type Input = IndexedSeq[Int]

  override def parseInput = {
    nextInt
    next map {_.toString.toInt}
  }

  override def apply(input: Input) = {
    val total = input.zipWithIndex.foldLeft(0) {
      case (c, (n, i)) => (c max i) + n
    }
    total - input.sum
  }
}
