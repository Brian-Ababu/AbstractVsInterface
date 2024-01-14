package com.example.abstractvsinterface.accounts

import com.example.abstractvsinterface.bankoperations.BankAccount


// User bank account methods
abstract class UserBankAccount(private var initialBalance: Double) : BankAccount {
    private var balance: Double = initialBalance

    override fun deposit(amount: Double) {
        if (amount>0){
        balance += amount
        }
    }

    override fun withdraw(amount: Double) {
        if (balance >= amount) {
            balance -= amount
        } else {
            println("Insufficient funds!")
        }
    }

    override fun getBalance(): Double {
        return balance
    }

    //Method to withdraw from the teller
    override fun withdrawViaTeller(amount: Double) {
        withdraw(amount)
    }

    //Method to withdraw from an ATM
    override fun withdrawViaAtm(amount: Double) {
        withdraw(amount)
    }

    abstract fun accountType(): String
}
