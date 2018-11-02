package model

// Creator class
abstract class KnifeStore {

    // Default operation to return an object
    fun orderKnife(knifeType: String): Knife {
        val knife: Knife = createKnife(knifeType)

        //prepare the knife
        knife.sharpen()
        knife.polish()
        knife.pack()

        return knife
    }

    // Abstract factory method
    abstract fun createKnife(knifeType: String): Knife
}
