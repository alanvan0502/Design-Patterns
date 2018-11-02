package model
import java.math.BigDecimal

class Savings(initAmount: BigDecimal) : Account(initAmount) {
    override fun printAccountNumber(): String {
        return ("Savings account: " + this.getAccountNumber())
    }
}