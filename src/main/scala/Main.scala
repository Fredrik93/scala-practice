@main def theMainiestOfMainMethods(): Unit =
  val circle = Circle(4)
  println(s"area is : ${area(circle)}")
  val rectangle = Rectangle(2,2)
  println(s"area of rectangle is : ${area(rectangle)}")