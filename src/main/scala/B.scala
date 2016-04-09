object B extends Solver(inputFile = "B-large.in") {
  override type Input = String
  override type Output = Int

  override def read = {
    in.next()
  }

  override def apply(input: Input) = {
    input.replaceAll(s"[+]+", "+").replaceAll("[-]+", "-").stripSuffix("+").length
  }
}
