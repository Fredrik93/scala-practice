import functional.CalcNumbers

@main def theMainiestOfMainMethods(): Unit =
  println(CalcNumbers.squared(23))
  println(CalcNumbers.isEmpty(""))
  println(CalcNumbers.isEmpty("helloo"))
  println(CalcNumbers.concatenate("micho", "macho"))