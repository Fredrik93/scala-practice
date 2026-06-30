abstract class Vehicle(brand: String):
  val fuelType: String = "Deffydefault - Gasoline"
  def describe: String = s"$brand runs on fueltype $fuelType"

case class Car(brand: String, amountOfDoors: Int) extends Vehicle(brand) {
  override val fuelType: String = if brand.equals("Tesla") then "Electricity" else "Gasoline"
}
// Every single moped is a vesla in this universe
case object Moped extends Vehicle("Vespa") {
}


