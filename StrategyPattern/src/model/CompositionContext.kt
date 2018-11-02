package model

class CompositionContext(
    private val compositor: Compositor, private val name: String) {

    // Use the default behavior
    fun default() {
        println("This is the default behavior")
    }

    // Data passing technique 1: Take the data to the strategy
    fun traverse() {
        compositor.compose(name)
    }

    // Data passing technique 2: Context pass itself as an argument
    fun repair() {
        compositor.compose(this)
    }

    fun getName(): String {
        return name
    }

}