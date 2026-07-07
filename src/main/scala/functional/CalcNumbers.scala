package functional

object CalcNumbers:
  val squared: Int => Int = (x: Int) => x * x
  val isEmpty: String => Boolean = (s: String) => s.isEmpty
  val concatenate: (String, String) => String = (s: String, s2: String) => s + " " + s2
  val tripleVal: Int => Int = x => x * 3

  def applyToAll(list: List[Int], f: Int => Int): List[Int] = for x <- list yield f(x)

  def adder(amountToAdd: Int): Int => Int =
    x => x + amountToAdd


  def multiply(x: Int) (y: Int): Int = x * y