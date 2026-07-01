enum Season:
  case SUMMER, AUTUMN, WINTER, SPRING

  def describe(): String =
    this match
      case SUMMER => "summeeeer!"
      case AUTUMN => "Aut"
      case WINTER => "Winter"
      case SPRING => "spring"
