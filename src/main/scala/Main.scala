@main def theMainiestOfMainMethods(): Unit =
  val s1 = NonEmptyValidator()
  val s2 = LengthValidator()
  
  println(s1.validate("hi"))
  println(s2.validate("hiiiiiiii"))
  
  println(s1.validate(" "))
  println(s2.validate("hi"))
