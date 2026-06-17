def countDown(x: Int): Unit = 
    if x <= 0 then println("Done")
    else
        println(x)
        val updated = x -1
        countDown(updated)


def factorial(n: Int, acc: Int = 1): Int = 
    if n <= 1 then acc
    else
        println(n) 
        factorial(n -1, acc * n)