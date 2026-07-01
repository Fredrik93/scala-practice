@main def theMainiestOfMainMethods(): Unit =
  val summer = Season.SUMMER.describe();
  val autum = Season.AUTUMN.describe();
  val spring = Season.SPRING.describe();
  val winter = Season.WINTER.describe()
  println(s"$summer $autum $spring $winter")

