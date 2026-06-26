sealed trait NetworkError
def checkError(ne: NetworkError): String =
  ne match
    case Timeout(msg) => s"error: ${msg}"
    case NotFound(msg) => s"error: ${msg}"
    case ServerError(msg) => s"error: ${msg}"

case class Timeout(message: String) extends NetworkError
case class NotFound (message: String) extends NetworkError
case class ServerError (message: String) extends NetworkError
