package model

class SteakKnife: Knife() {
    override fun sharpen() {
        println("Sharpen the steak knife")
    }

    override fun polish() {
        println("Polish the steak knife")
    }

    override fun pack() {
        println("Pack the steak knife")
    }
}