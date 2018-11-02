package model

class ChefsKnife: Knife() {
    override fun sharpen() {
        println("Sharpen the chef knife")
    }

    override fun polish() {
        println("Polish the chef knife")
    }

    override fun pack() {
        println("Pack the chef knife")
    }
}