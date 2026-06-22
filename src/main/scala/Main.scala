@main def mainymainy(): Unit =
  val nums = Array(1,2,3)
  val res = Solution.concatWithReverse(nums)
  println(res.mkString(", "))
