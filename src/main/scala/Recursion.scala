
import scala.annotation.tailrec

@tailrec
def tailRecursiveFactorial (n: Int, acc: Int = 1): Int =
    if n <= 1 then acc
    else
        println(n)
        tailRecursiveFactorial(n-1, acc * n)
         
// this will fail since it is not tail recursive and the annotation is checking whether it is. Its warning us because if it is not tail recursive it will throw an exception
// stackoverflow error whenever too many frames are pushed to the stack. tail recursive method reuses the same frame instead of stacking thousands on top of each other
@tailrec
def recursiveFactorial (n: Int): Int = 
    if n <= 1 then 1
    else 
        println(n)
        recursiveFactorial(n-1)