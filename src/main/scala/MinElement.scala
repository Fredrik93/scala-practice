def minElement(nums: Array[Int]): Int = {
    val result = nums.map { num => 
        println(num)
        val currentNumber = 
            num.toString.toList.map(n => n.asDigit).sum
        println(s"current number: ${currentNumber}")
        currentNumber
        // split into separate digits or map over them and sum them 
        
    }
    println(result.mkString(", "))
    result.min
}

def minElementAsAPipeline(nums: Array[Int]): Int = nums.map(_.toString.toList.map(_.asDigit).sum).min
