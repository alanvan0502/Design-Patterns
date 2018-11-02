package model

class KnifeStore(private val factory: KnifeFactory) {

    fun orderKnife(knifeType: String): Knife {
        val knife: Knife = factory.createKnife(knifeType)

        //prepare the knife
        knife.sharpen()
        knife.polish()
        knife.pack()

        return knife
    }
}

fun main(args: Array<String>) {
    val knifeStore = KnifeStore(factory = KnifeFactory())
    knifeStore.orderKnife("chefs")
    knifeStore.orderKnife("steak")
}