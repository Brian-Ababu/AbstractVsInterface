//import com.example.abstractvsinterface.accounts.CheckingAccount
//import com.example.abstractvsinterface.accounts.SalaryAccount
import com.example.abstractvsinterface.brokers.StockBroker

import com.example.abstractvsinterface.accounts.SavingsAccount

fun main() {
    //val salary = SalaryAccount(100000.0)
    val savings = SavingsAccount(1000.0)
    //val checking = CheckingAccount(500.0)

    //salary.deposit(10000.0)
    //salary.withdrawViaTeller(2000.0)
    //salary.withdrawViaAtm(2000.0)

      savings.deposit(500.0)
      savings.withdraw(200.0)
//    checking.withdraw(200.0)
//
    println("${savings.accountType()} has balance: ${savings.getBalance()}")
//    println("${checking.accountType()} has balance: ${checking.getBalance()}")
   // println("${salary.accountType()} has balance: ${salary.getBalance()}")


    val stockBroker = StockBroker()

    stockBroker.buyShares("KCB", 100)
    stockBroker.buyShares("BAT", 400)

    val portfolio = stockBroker.getPortfolio()
    println("Stock Portfolio:")
    for ((stockName, quantity) in portfolio) {
        println("$stockName: $quantity shares")
    }
}
