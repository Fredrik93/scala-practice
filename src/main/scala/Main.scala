@main def theMainiestOfMainMethods(): Unit =
  val vehicles = List(Car(brand = "Tesla", amountOfDoors = 5), Moped)

    vehicles.foreach(n => println(n.describe))

