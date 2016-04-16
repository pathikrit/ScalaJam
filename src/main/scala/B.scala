object B extends Solver(inputFile = "B-large.in") {
  override type Answer = String

  override def solve() = {
    val n = in.next[Int]
    val nums = Seq.fill((2*n - 1)*n)(in.next[Int])
    val ans = nums.groupBy(identity) collect {
      case (i, c) if c.length%2 == 1 => i
    }
    ans.toSeq.sorted mkString " "
  }
}
