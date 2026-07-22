import functional.CalcNumbers
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class CalcNumbers extends AnyFunSuite with Matchers:


  test("sort with: Ints in descending order ") {
    val list = List(1,2,3,4,45,55,12,32)
    val res = CalcNumbers.sortListWith(list)
    res should be (List(55,45,32,12,4,3,2,1))
  }
  test("sort by last character in string ") {
    val list = List("Apa", "Banan", "Donkeyb")
    val res = CalcNumbers.sortListBy(list)
    res should be (List("Apa","Donkeyb", "Banan"))
  }
  test("sort by in string ") {
    val list = List("Apa", "Banan", "Donkeyb")
    val res = CalcNumbers.sortBy(list)
    res should be(List("Apa", "Donkeyb", "Banan"))
  }
  test("get distinct values") {
    val list =  List (1,1,1,2,2,34,34,3,2,5,4)
    val res = CalcNumbers.getDistinct(list)
    res should be (List(1,2,34,3,5,4))
  }
  test ("get 3 first pages from page 0 "){
    val list = List(1,2,3,4,5,6,7,8,9,10,11)
    val res = CalcNumbers.getPage(list, 0, 3)
    res should be (List(1,2,3))
  }
  test("get 2 first pages from page 4 ") {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11)
    val res = CalcNumbers.getPage(list, 4, 2)
    res should be(List(9, 10))
  }

  test("find number"):
    val list = List(1, 13, 2, 3, 3)
    val res = CalcNumbers.tryFind(list)
    res should be(Some(13))

  test("check if number exist"):
    val list = List(1, 13, 2, 3, 3)
    val res = CalcNumbers.tryExist(list)
    res should be(true)

  test("for all should be true"):
    val list = List(2, 13, 2, 3, 3)
    val res = CalcNumbers.tryForAll(list)
    res should be(true)


  test("for all should be false"):
    val list = List(1, 13, 2, 3, 3)
    val res = CalcNumbers.tryForAll(list)
    res should be(false)

  test("partition stuff"):
    val list = List(1, 2, 3, 30, 20, 10)
    val res = CalcNumbers.usePartitionToSeparateNumbersGreaterThan10(list)
    res should be((List(30, 20), List(1, 2, 3, 10)))

  test("group strings by length"):
    val l = List("some", "alla", "hi", "fd", "dfsdfewfewfw")
    val res = CalcNumbers.groupStringsByLength(l)
    res should be(Map(2 -> List("hi", "fd"), 12 -> List("dfsdfewfewfw"), 4 -> List("some", "alla")))

  test("zip product and prices"):
    val products = List("Apple", "IBM", "Dell Xps")
    val prices = List(14000, 10000, 40000000, 30)
    val result = CalcNumbers.zipProductsAndTheirPrices(products, prices)
    result should be(List(("Apple", 14000.0), ("IBM", 10000.0), ("Dell Xps", 40000000.0)))

  test("double all ints, throw away strings"):
    val input = List(1, 2, "hi", 3, "4")
    val result = CalcNumbers.doubleAllInts(input)
    result should be(List(2, 4, 6))

  test("String length greater than 3"):
    val input = List("hello", "foo", "adapter")
    val result = CalcNumbers.stringWithLengthGreaterThanThree(input)
    result should be(2)


  test("sum all ints"):
    val input = List(1, 2, 3, 4, 5)
    val result = CalcNumbers.sumAllInts(input)
    result should be(15)

  test("get max int"):
    val input = List(1, 2, 9, 3, 4, 5)
    val result = CalcNumbers.findMaxValUsingFold(input)
    result should be(9)

  test("Numbers in list greater than 10 "):
    val input = List(1, 2, 3, 4, 10, 11, 12)
    val result = CalcNumbers.getNumbersGreaterThanTen(input)
    result should be(List(11, 12))

  test("String not starting with a"):
    val input = List("hello", "foo", "adapter")
    val result = CalcNumbers.getStringsNotStartingWithA(input)
    result should be(List("hello", "foo"))


  test("flattenStrings should split sentences into individual words"):
    val input = List("hello world", "foo bar")
    val result = CalcNumbers.flattenStrings(input)
    result should be(List("hello", "world", "foo", "bar"))

  test("flattenStrings should handle a single sentence"):
    val result = CalcNumbers.flattenStrings(List("one two three"))
    result should be(List("one", "two", "three"))
