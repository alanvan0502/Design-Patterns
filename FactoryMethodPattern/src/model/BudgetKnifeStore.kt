package model

class BudgetKnifeStore: KnifeStore() {
    override fun createKnife(knifeType: String): Knife {
        lateinit var knife: Knife

        // create Knife object
        knife = BudgetKnife()

        return knife
    }
}
