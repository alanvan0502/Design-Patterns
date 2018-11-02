class OldCoffeeMachineSubClass: OldCoffeeMachine() {
    override fun selectA() {
        println("Older Machine: Select flavor A")
    }

    override fun selectB() {
        println("Older Machine: Select flavor B")
    }
}