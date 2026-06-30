abstract class Vehicle(brand: String, fuelType: String):
  def describe: String = s"$brand runs on fueltype $fuelType"

case class Car(brand: String, fuelType: String, amountOfDoors: Int) extends Vehicle(brand, fuelType)
// Every single moped is a vesla in this universe
case object Moped extends Vehicle("Vespa", "Gasoline")


