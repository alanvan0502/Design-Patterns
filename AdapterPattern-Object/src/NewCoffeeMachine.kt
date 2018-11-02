class NewCoffeeMachine(private var coffeeMachineAdapter: CoffeeMachineInterface) {

    fun touchSreenSelectA() {
        coffeeMachineAdapter.chooseFirstSelection()
    }

    fun touchScreenSelectB() {
        coffeeMachineAdapter.chooseSecondSelection()
    }
}