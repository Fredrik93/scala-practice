import functional.CalcNumbers

@main def theMainiestOfMainMethods(): Unit = {
  val multiplyByDouble = CalcNumbers.multiply(2)
  val multiplyByTriple = CalcNumbers.multiply(3)
  println(s"double: ${multiplyByDouble(5)}")
  print(s"triple ${multiplyByTriple(5)}")

}