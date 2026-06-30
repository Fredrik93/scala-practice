@main def theMainiestOfMainMethods(): Unit =
  val vehicles = List(Car(brand = "Tesla", amountOfDoors = 5, fuelType =  "Electricity"), Moped)

    vehicles.foreach(n => println(n.describe))

