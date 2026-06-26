trait Shape:
  def area: Double

  def perimeter: Double

trait Describable:
  def describe: String = "I am a Shape"

case class Circle(radius: Double) extends Shape with Describable:
  def area: Double = math.Pi * radius * radius

  def perimeter: Double = 2 * math.Pi * radius


case class Rectangle(height: Double, width: Double) extends Shape:
  def area: Double = height * width

  def perimeter: Double = 2 * (height + width)
