package model
import java.math.BigDecimal

class Investment(initAmount: BigDecimal): Account(initAmount) {
    override fun printAccountNumber(): String {
        return "Investment account: " + this.getAccountNumber()
    }
}