abstract class Solver(inputFile: String) extends App {
  type Input
  type Output

  def read: Input

  def apply(input: Input): Output

  def format(output: Output): String = output.toString

  val in = new java.util.Scanner(getClass.getResourceAsStream(inputFile))

  for (i <- 1 to in.nextInt) {
    println(s"Case #$i: ${format(apply(read))}")
  }

  in.close()
}
