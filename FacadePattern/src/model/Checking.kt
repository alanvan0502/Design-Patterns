package model
import java.math.BigDecimal

class Checking(initAmount: BigDecimal) : Account(initAmount) {
    override fun printAccountNumber(): String {
        return "Checking account: " + this.getAccountNumber()
    }
}