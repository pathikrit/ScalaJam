abstract class Solver(inputFile: String) extends App {
  type Input
  type Output
  def read: Input
  def apply(input: Input): Output
  def format(output: Output): String = output.toString

  /*********************************************************************/
  import better.files._

  val in = File(inputFile).newScanner
  val out = File(inputFile.replace(".in", ".out")).newOutputStream.printer()

  println(s"Solving: $inputFile")
  for (i <- 1 to in.next[Int]) {
    val output = s"Case #$i: ${format(apply(read))}"
    println(output)
    out.println(output)
  }
  in.close()
  out.close()
}
