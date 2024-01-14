package com.example.abstractvsinterface.bankoperations

// BankOperations Interface
interface BankAccount {
    fun deposit(amount: Double)
    fun withdraw(amount: Double)
    fun getBalance(): Double
    fun withdrawViaTeller(amount: Double)
    fun withdrawViaAtm(amount: Double)
}

