object C extends Solver(inputFile = "C.in") {
  override type Input = String
  override type Output = Input

  override def read = {
    import scanner._
    next
  }

  override def apply(input: Input) = {
    input
  }
}
