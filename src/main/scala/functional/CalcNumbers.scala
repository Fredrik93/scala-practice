package functional

object CalcNumbers:
  val squared: Int => Int = (x: Int) => x * x
  val isEmpty: String => Boolean = (s: String) => s.isEmpty
  val concatenate: (String, String) => String = (s: String, s2: String) => s + " " + s2
  val tripleVal: Int => Int = x => x * 3
  
  def tryFind(list: List[Int]): Option[Int] = list.find(n => n > 10)
  
  def tryExist(list: List[Int]): Boolean = list.exists(n => n > 10)
  
  def tryForAll(list: List[Int]): Boolean = list.forall( n => n >= 2)

  def usePartitionToSeparateNumbersGreaterThan10(list: List[Int]): (List[Int], List[Int]) =
    val (greaterThan, lowerThan) = list.partition(n => n > 10)
    (greaterThan, lowerThan)

  def groupStringsByLength(l: List[String]): Map[Int, List[String]] =
    l.groupBy(s => s.length)

  def zipProductsAndTheirPrices(product: List[String], prices: List[Int]): List[(String, Int)] =
    product.zip(prices)

  def doubleAllInts(l: List[Any]): List[Int] =
    l.collect:
      case n: Int => n * 2

  def stringWithLengthGreaterThanThree(l: List[String]): Int =
    l.foldLeft(0)((acc, s) => if s.length > 3 then acc + 1 else acc)

  // suppress warning because it wants to use .sum but this is for practice
  //noinspection SimplifiableFoldOrReduce
  def sumAllInts(l: List[Int]): Int = l.foldLeft(0)((acc, n) => acc + n)

  def findMaxValUsingFold(l: List[Int]): Int = l.foldLeft(0)((acc, n) => if n > acc then n else acc)

  def applyToAll(list: List[Int], f: Int => Int): List[Int] = for x <- list yield f(x)

  def getNumbersGreaterThanTen(l: List[Int]): List[Int] = l.filter(n => n > 10)

  def getStringsNotStartingWithA(l: List[String]): List[String] = l.filterNot(s => s.startsWith("a"))

  def flattenStrings(list: List[String]): List[String] = list.flatMap(_.split(" "))


  def adder(amountToAdd: Int): Int => Int =
    x => x + amountToAdd


  def multiply(x: Int)(y: Int): Int = x * y

  def countries(): Unit =
    val countries = Map("Spain" -> "Barcelona", "Netherlands" -> "Amsterdam", "South africa" -> "Johannesburg")
    countries.foreach((name, capital) => println(s"$name - $capital"))
    println("\n")

    val addedFourth = countries + ("Sweden" -> "Stockholm")
    addedFourth.foreach((name, capital) => println(s"$name - $capital"))
    println("\n")
    val removedOne = addedFourth - "Spain"
    removedOne.foreach((name, capital) => println(s"$name - $capital"))

    println("******")
    println(removedOne("Sweden"))
    println(removedOne.get("Japan"))

  def uppercase(l: List[String]): List[String] =
    l.map(_.toUpperCase)

  def convertToString(list: List[Int]): List[String] =
    list.map(s => s"Number: $s")


