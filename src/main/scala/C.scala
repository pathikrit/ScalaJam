object C extends Solver(inputFile = "C.in") {
  override type Input = String
  override type Output = Input

  override def read = {
    in.next()
  }

  override def apply(input: Input) = {
    input
  }
}
