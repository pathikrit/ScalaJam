object A extends Solver(inputFile = "A-large.in") {
  import scala.collection.mutable

  override type Input = BigInt
  override type Output = Option[BigInt]

  override def read = {
    in.next[BigInt]
  }

  override def apply(input: Input) = {
    val seen = mutable.Set.empty[BigInt]
    val digits = mutable.Set.empty[Char]
    var i = input
    var add = true

    while(digits.size < 10 && add) {
      digits ++= i.toString
      add = seen.add(i)
      i += input
    }

    if (digits.size == 10) Some(i - input) else None
  }

  override def format(output: Output) = output.map(_.toString) getOrElse "INSOMNIA"
}
