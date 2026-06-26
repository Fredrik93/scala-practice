@main def theMainiestOfMainMethods(): Unit =
  val r = Rectangle(2,2)
 
  val n = Timeout("timeout")
  println(checkError(n))
  println(checkError(NotFound("fanns ej")))
  println(checkError(ServerError("serveeer")))