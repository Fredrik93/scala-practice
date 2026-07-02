  enum Network(msg: String):
    case TIMEOUT extends Network("timeout")
    case NOTFOUND extends Network("notfound")
    case SERVERERROR extends Network("server")
    def checkError: String =
      this match
        case TIMEOUT => s"$msg error occured"
        case NOTFOUND => s"$msg error occured"
        case SERVERERROR => s"$msg error occured"
