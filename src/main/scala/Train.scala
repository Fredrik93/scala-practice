trait TrainFeatures:
  val maxSpeed: Int
  def describe: String

case object LongTrain extends TrainFeatures:
  val maxSpeed = 120
  def describe: String = "A long train"

case object ShortTrain extends TrainFeatures:
  val maxSpeed = 200
  def describe: String = "A short train"

case object Commuter extends TrainFeatures:
  val maxSpeed = 80
  def describe: String = "A commuter train"

case class TGV(typeOfTrain: String) extends TrainFeatures:
  val maxSpeed = 190
  def describe: String = s"The ${typeOfTrain} train"
