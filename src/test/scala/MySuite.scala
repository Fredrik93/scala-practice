import functional.CalcNumbers
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MySuite extends AnyFunSuite with Matchers:

  test("Numbers in list greater than 10 "):
    val input =  List(1,2,3,4,10,11,12)
    val result = CalcNumbers.getNumbersGreaterThanTen(input)
    result should be (List(11,12))

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
