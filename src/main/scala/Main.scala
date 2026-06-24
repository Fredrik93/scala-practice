@main def mainymainy(): Unit =
  val account = BankAccount("Fred", 100)
  println(s"owner: ${account.ownerName}, current balance: ${account.balance}")
  account.deposit(20)
  account.deposit(-20)
  println(s"owner: ${account.ownerName}, current balance: ${account.balance}")
  
