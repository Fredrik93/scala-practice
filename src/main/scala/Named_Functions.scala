def NamedFunctions(): Unit =
  val res = makeEmail("fredu2", "gmail.com")
  val res2 =  makeEmail(domain = "gmail.com", userName="fredu")
  println(res)
  println(res2)

def makeEmail(userName: String, domain: String): String = s"$userName@$domain" 