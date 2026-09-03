import leetcode.TwoNums
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class TwoNumsTest extends AnyFunSuite with Matchers:

  test("testok1") {
    val arr = Array(1,2,3,4);
    val res = TwoNums().findIndices(arr)
    res should be (List(-1,-1))
  }


