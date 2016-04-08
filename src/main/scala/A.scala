object A extends Solver(inputFile = "A.in") {
  override type Input = BigInt
  override type Output = Input

  override def read = {
    in.next
  }

  override def apply(input: Input) = {
    input
  }
}
