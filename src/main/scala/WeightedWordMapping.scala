    def mapWordWeights(words: Array[String], weights: Array[Int]): String = {

        words.map { word => 
            val total = word.toList.map(c => weights(c - 'a')).sum
            val mapped = total % 26
            ('z' - mapped).toChar}.mkString
    }

        
    
