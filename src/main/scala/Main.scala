@main def theMainiestOfMainMethods(): Unit =
  val trains = List(ShortTrain, LongTrain, Commuter, TGV("tgv"))

  val speeds = trains.map(_.maxSpeed)

  val summedMaxSpeed = trains.map(n=> n.maxSpeed).sum
  println(s"sum of max speed: ${summedMaxSpeed}")
  println(speeds)
