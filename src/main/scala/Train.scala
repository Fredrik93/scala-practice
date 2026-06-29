trait TrainFeatures:
  val maxSpeed: Int = 50
  def describe: String

case object LongTrain extends TrainFeatures:
  override val maxSpeed = 120
  def describe: String = "A long train"

case object ShortTrain extends TrainFeatures:
  override val maxSpeed = 200
  def describe: String = "A short train"

case object Commuter extends TrainFeatures:
  override val maxSpeed = 80
  def describe: String = "A commuter train"

case class TGV(typeOfTrain: String) extends TrainFeatures:
  def describe: String = s"The ${typeOfTrain} train"

trait Animal(name: String)

abstract class OtherAnimal (val name: String):
  def sound: String
  
case class FurAnimal(weight: Int) extends OtherAnimal("cow"):
  def sound: String = "A sound from an animal"


case class AnAnimal(weight: Int) extends Animal("snake"):
  def sound: String = "A sound from a snake"