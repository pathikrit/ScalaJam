import better.files._
abstract class Solver(inputFile: String) extends App {
  def solve(): Any
  val in = Scanner(getClass.getResourceAsStream(inputFile))(Scanner.Config.default)
  val out = File(inputFile.replace(".in", ".out")).newOutputStream.printer()
  println(s"Solving: $inputFile")
  for (i <- 1 to in.next[Int]) {
    val output = s"Case #$i: ${solve()}"
    println(output)
    out.println(output)
  }
  in.close()
  out.close()
}
