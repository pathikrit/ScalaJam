case class Memo[I <% K, K, O](f: I => O) extends (I => O) {
  import collection.mutable.{Map => Dict}
  val cache = Dict.empty[K, O]
  override def apply(x: I) = cache getOrElseUpdate (x, f(x))
}

object Memo {
  type F[I, O] = Memo[I, I, O]
}
