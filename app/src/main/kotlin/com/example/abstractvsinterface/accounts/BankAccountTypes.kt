package com.example.abstractvsinterface.accounts

class SalaryAccount(balance: Double) : UserBankAccount(balance){
    override fun accountType(): String {

        return "My Salary Account"
    }
}

class SavingsAccount(balance: Double) : UserBankAccount(balance) {
    override fun accountType(): String {

        return "Savings Account"
    }
}

class CheckingAccount(balance: Double) : UserBankAccount(balance) {
    override fun accountType(): String {

        return "Checking account"}
}

class FixedDepositAccount(balance: Double) : UserBankAccount(balance){
    override fun accountType(): String {

        return "Fixed Deposit Account"
    }
}
