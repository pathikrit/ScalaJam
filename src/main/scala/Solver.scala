case class Memo[A, B](f: A => B) extends (A => B) {
  import scala.collection.mutable.{Map => Dict}
  private val cache = Dict.empty[A, B]
  def apply(x: A) = cache getOrElseUpdate (x, f(x))
}

abstract class Solver extends App {
  type Input

  def inputFile: String

  def parseInput: Input

  def apply(input: Input): Any

  val in = new java.util.Scanner(new java.io.File("data/" + inputFile))
  import in._

  for (i <- 1 to nextInt) {
    println(s"Case #$i: ${apply(parseInput)}")
  }

  in.close()

  def toSeq[A](f: => A, n: Int = nextInt) = IndexedSeq.fill(n)(f)
  def toList[A](f: => A, n: Int = nextInt) = List.fill(n)(f)
}
