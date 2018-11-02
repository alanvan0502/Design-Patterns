class CoffeeMachineAdapter: CoffeeMachineInterface {

    private lateinit var oldCoffeeMachine: OldCoffeeMachine

    override fun connect(oldCoffeeMachine: OldCoffeeMachine){
        this.oldCoffeeMachine = oldCoffeeMachine
    }

    override fun chooseFirstSelection() {
        oldCoffeeMachine.selectA()
    }

    override fun chooseSecondSelection() {
        oldCoffeeMachine.selectB()
    }
}