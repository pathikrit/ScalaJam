case class Memo[I <% K, K, O](f: I => O) extends (I => O) {
  import scala.collection.mutable
  val cache = mutable.Map.empty[K, O]
  override def apply(x: I) = cache.getOrElseUpdate(x, f(x))
}

object Memo {
  type ==>[I, O] = Memo[I, I, O]
}
