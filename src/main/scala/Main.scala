import functional.CalcNumbers

@main def theMainiestOfMainMethods(): Unit = {
  val doubleTheValue: Int => Int = x => x * 2
  val doubled = CalcNumbers.applyToAll(List(1,2,3,4), doubleTheValue)
  doubled.foreach(p =>  println(s" value: $p"))
}