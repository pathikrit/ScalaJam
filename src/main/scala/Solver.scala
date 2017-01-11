import better.files._
abstract class Solver(inputFile: String) extends App {
  println(s"Solving: $inputFile")

  def solve(): Any

  for {
    in <- Scanner(getClass.getResourceAsStream(inputFile))(Scanner.Config.default).autoClosed
    out <- File(inputFile.replace(".in", ".out")).newOutputStream.printer().autoClosed
    i <- 1 to in.next[Int]
    output = s"Case #$i: ${solve()}"
  } {    
    println(output)
    out.println(output)
  }
}
