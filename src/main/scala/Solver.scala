abstract class Solver(inputFile: String) extends App {
  type Input
  type Output
  def read: Input
  def apply(input: Input): Output
  def format(output: Output): String = output.toString

  /*********************************************************************/
  import java.io.{File, PrintWriter}
  import java.util.Scanner
  val scanner = new Scanner(getClass.getResourceAsStream(inputFile))
  val out = new PrintWriter(new File(inputFile.replace(".in", ".out")))
  println(s"Solving: $inputFile")
  for (i <- 1 to scanner.nextInt) {
    val output = s"Case #$i: ${format(apply(read))}"
    println(output)
    out.println(output)
  }
  scanner.close()
  out.close()
}
