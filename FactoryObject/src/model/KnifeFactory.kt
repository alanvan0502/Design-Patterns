package model

class KnifeFactory {
    fun createKnife(knifeType: String): Knife {
        lateinit var knife: Knife

        // create Knife object
        if (knifeType == "steak") {
            knife = SteakKnife()
        } else if (knifeType == "chefs") {
            knife = ChefsKnife()
        }

        return knife
    }
}