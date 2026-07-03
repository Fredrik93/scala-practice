package functional

object CalcNumbers:
  val squared: Int => Int = (x: Int) => x * x
  val isEmpty: String => Boolean = (s: String) => s.isEmpty
  val concatenate: (String, String) => String = (s: String, s2: String) => s + " " + s2

  def triple(x: Int): Int = x * 3
  val tripleVal: Int => Int = x => x * 3

  def applyToAll(list: List[Int]): Int = -12


