object DigitFrequencyScore {
    def digitFrequencyScore(n: Int): Int =
        val digits = n.toString.map(_.asDigit).toList
        digits.distinct.map(d => d * digits.count(x => x == d)).sum
}