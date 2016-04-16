object C extends Solver(inputFile = "C-small-attempt1.in") {
  override type Answer = Int

  override def solve() = {
    val n = in.next[Int]
    val bff = IndexedSeq.fill(n)(in.next[Int] - 1)

    def isCircle(circle: IndexedSeq[Int]): Boolean = {
      val ll = circle.length
      circle.indices forall {i =>
        val r = circle((i + 1) % ll)
        val l = circle((ll + i - 1) % ll)
        val f = bff(circle(i))
        f == l || f == r
      }
    }

    if(bff.size == 10) {
      isCircle(Vector(0, 6, 8, 2, 9, 3))
    }

    n to 3 by -1 find { l =>
      (0 until n).combinations(l).exists(group => group.permutations.exists(isCircle))
    } getOrElse 3
  }


}
