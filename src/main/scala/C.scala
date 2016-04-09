object C extends Solver(inputFile = "C.in") {
  override type Input = (Int, Int)
  override type Output = Seq[JamCoin]

  override def read = {
    in.next[Int] -> in.next[Int]
  }

  case class JamCoin(x: Int) {
    val amount = x.toBinaryString

    lazy val proofs = 2 to 10 flatMap factor

    override def toString = proofs.mkString(amount + " ", " ", "")

    def isValid = proofs.length == 9

    def factor(base: Int) = {
      val k = BigInt(amount, base)
      (2 until (k.intValue() min 100)) find {i => k%i == 0}
    }
  }

  override def apply(input: Input) = {
    val (n, j) = input
    (0 until (1 << (n - 2))).view
      .map(i => JamCoin((1 << (n-1)) | (i << 1) | 1))
      .filter(_.isValid)
      .take(j)
      .seq
  }

  override def format(output: Output) = output mkString "\n"
}
