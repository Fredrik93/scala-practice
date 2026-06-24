class Rectangle (val height: Int, val width: Int) 

object Rectangle: 
    def apply(height: Int, width: Int): Rectangle =
        new Rectangle(height, width)