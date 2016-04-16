object A extends Solver(inputFile = "A-large.in") {
  override type Answer = String

  override def solve() = {
    var ans = ""
    in.next() foreach {c =>
      if (ans.isEmpty || c < ans.head) {
        ans += c
      } else {
        ans = c + ans
      }
    }
    ans
  }
}
