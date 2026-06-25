case class Circle(radius: Double)

case class Rectangle ( height: Double, width: Double)



def area (shape: Any): Double =
  shape match
    case Circle(r) => math.Pi * r * r
    case Rectangle(height, width) => height * width
    case _ => 0.0