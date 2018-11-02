package singleton

object ExampleSingleton {
    init {
        println("Singleton class invoke with Kotlin")
    }

    private var name = ""

    fun printName() {
        println(name)
    }

    fun setName(name: String) {
        this.name = name
    }
}

fun main(args: Array<String>) {
    ExampleSingleton.setName("Alan Van")
    ExampleSingleton.printName()
}