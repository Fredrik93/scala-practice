import functional.CalcNumbers
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MySuite extends AnyFlatSpec with Matchers {
  "flattenStrings" should "split sentences into individual words" in :
    val input = List("hello world", "foo bar")
    val result = CalcNumbers.flattenStrings(input)
    result should be(List("hello", "world", "foo", "bar"))

  it should "handle a single sentence" in :
    val result = CalcNumbers.flattenStrings(List("one two three"))
    result should be(List("one", "two", "three"))


  "flattenString" should "split some stuff" in :
    val list = List("Hello my name is", "fredrik and i", "am currently reading", "lotr it is", "way too long and confusing")
    val result = CalcNumbers.flattenStrings(list)
    val expected = List("Hello", "my", "name", "is", "fredrik", "and", "i", "am", "currently", "reading", "lotr", "it", "is", "way", "too", "long", "and", "confusing")
    result should be(expected)

}
