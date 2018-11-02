package model

import java.math.BigDecimal

fun main(args: Array<String>) {
    val myBankService = BankService()
    val mySaving = myBankService.createNewAccount("savings", BigDecimal(500.00))
    val myInvestment = myBankService.createNewAccount("investment", BigDecimal(1000.00))

    myBankService.transferMoney(mySaving, myInvestment, BigDecimal(500.00))

    myBankService.printBalance(mySaving)
    myBankService.printBalance(myInvestment)

    myBankService.transferMoney(mySaving, myInvestment, BigDecimal(100.00)) //print insufficient fund

    myBankService.transferMoney(1, 2, BigDecimal(3)) //print "wrong account number"

    myBankService.printAccountNumber(mySaving) //print the savings account number
    myBankService.printAccountNumber(myInvestment) //print the investment account number
    myBankService.printAccountNumber(1) // print "wrong account number"
}