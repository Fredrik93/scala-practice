object Solution {
    def concatWithReverse(nums: Array[Int]): Array[Int] = {
        nums ++ nums.reverse
    }
}