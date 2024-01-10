package com.example.abstractvsinterface.brokers

// StockBroker class
class StockBroker {
    private var kcbShares: Int = 0
    private var batShares: Int = 0

    fun buyShares(stockName: String, quantity: Int) {
        when (stockName) {
            "KCB" -> kcbShares += quantity
            "BAT" -> batShares += quantity
            else -> println("Invalid stock name!")
        }
    }

    fun getPortfolio(): Map<String, Int> {
        return mapOf("KCB" to kcbShares, "BAT" to batShares)
    }
}