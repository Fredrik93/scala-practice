

def sumOfSquares(numbers: List [Int]): Int = 
    def squared (number: Int): Int = number * number
    numbers.map(squared).sum
