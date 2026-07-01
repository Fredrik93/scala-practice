enum Color(val rgb: String):
  case RED extends Color("FF6666")
  case BLUE extends Color ("FR4433")
  case GREEN extends Color("H9879")
  def describe: String = s"Color: $rgb"
