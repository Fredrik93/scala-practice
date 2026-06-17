@main def mainymain(): Unit =
  println(multiply(2,2))
  println(isEven(2))
  println(isEven(3))

def multiply (x: Int, y: Int): Int = x * y

def isEven(x: Int): Boolean = if x % 2 == 0 then true else false 