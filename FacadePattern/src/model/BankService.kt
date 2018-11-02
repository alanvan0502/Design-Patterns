package model

import java.math.BigDecimal
import java.util.*

class BankService {
    private val bankAccounts = Hashtable<Int, Account>()

    fun createNewAccount(type: String, initAmount: BigDecimal): Int {
        var newAccount: Account? = null

        when (type) {
            "checking" -> newAccount = Checking(initAmount)
            "investment" -> newAccount = Investment(initAmount)
            "savings" -> newAccount = Savings(initAmount)
            else -> println("Invalid account type")
        }

        return if (newAccount != null) {
            bankAccounts[newAccount.getAccountNumber()] = newAccount
            newAccount.getAccountNumber()
        } else {
            -1;
        }
    }

    fun transferMoney(fromAccountNo: Int, toAccountNo: Int, amount: BigDecimal) {
        try {
            val fromAccount = bankAccounts[fromAccountNo]
            val toAccount = bankAccounts[toAccountNo]
            fromAccount!!.transfer(toAccount!!, amount)
        } catch (e: NullPointerException) {
            println("Wrong account number")
        } catch (e: IllegalArgumentException) {
            println("Insufficient fund")
        }
    }

    fun printBalance(accountNo: Int): Boolean {
        return try {
            val account = bankAccounts[accountNo]
            println(account!!.getBalance())
            true
        } catch (e: Exception) {
            println("Wrong account number")
            false
        }
    }

    fun printAccountNumber(accountNo: Int): Boolean {
        return try {
            val account = bankAccounts[accountNo]
            println(account!!.printAccountNumber())
            true
        } catch (e: Exception) {
            println("Wrong account number")
            false
        }
    }
}