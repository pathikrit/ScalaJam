abstract class Solver extends App {
  type Input

  def inputFile: String

  def parseInput: Input

  def apply(input: Input): Any

  def resourceFile(name: String) = new java.io.File(getClass.getResource(name).toURI)

  val in = new java.util.Scanner(resourceFile(inputFile))
  import in._

  for (i <- 1 to nextInt) {
    println(s"Case #$i: ${this(parseInput)}")
  }

  def skipLine[A](f: => A): A = {
    nextLine
    f
  }

  in.close()
}
