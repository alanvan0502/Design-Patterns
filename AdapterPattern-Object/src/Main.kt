fun main(args: Array<String>) {
    val oldCoffeeMachine = OldCoffeeMachine()
    val olderCoffeeMachine = OldCoffeeMachineSubClass()

    // Connect the new coffee machine with the old one
    val adapter = CoffeeMachineAdapter()

    adapter.connect(oldCoffeeMachine)
    val newCoffeeMachine = NewCoffeeMachine(adapter)

    newCoffeeMachine.touchSreenSelectA()
    newCoffeeMachine.touchScreenSelectB()

    // Connect the new coffee machine with the older one
    // (subclass of OldCoffeeMachine)

    adapter.connect(olderCoffeeMachine)

    newCoffeeMachine.touchScreenSelectB()
    newCoffeeMachine.touchSreenSelectA()
}