package model

import java.math.BigDecimal

abstract class Account (initAmount: BigDecimal) {

    companion object {
        const val ACCOUNT_CONST = 100
    }

    private var amount = initAmount
    private val accountNumber = Math.round((1 + Math.random()) * ACCOUNT_CONST)

    fun deposit(amount: BigDecimal) {
        this.amount += amount
    }

    fun withdraw(amount: BigDecimal) {
        this.amount -= amount
    }

    fun transfer(toAccount: Account, amount: BigDecimal) {
        if (this.amount >= amount) {
            this.withdraw(amount)
            toAccount.deposit(amount)
        } else throw IllegalArgumentException("insufficient fund")
    }

    fun getAccountNumber(): Int {
        return accountNumber.toInt()
    }

    abstract fun printAccountNumber(): String

    fun getBalance(): Int {
        return amount.toInt()
    }

}