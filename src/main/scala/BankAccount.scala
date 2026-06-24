class BankAccount(val ownerName: String, var balance: Int):

    def deposit(amountToDeposit: Int): Int = 
        println(s"attempting to deposit ${amountToDeposit} rupees")
        if amountToDeposit >= 0 then 
            balance += amountToDeposit
            println(s"succesful deposit, balance is now ${balance}")
            balance
        else 
            println(s"Deposit amount cant be negative or 0, amount tried was ${amountToDeposit}")
            balance
    

object BankAccount:
    def apply(ownerName: String, balance: Int): BankAccount = 
        new BankAccount(ownerName, balance)