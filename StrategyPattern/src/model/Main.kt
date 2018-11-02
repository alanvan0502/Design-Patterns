package model

fun main(args: Array<String>) {
    val ctx1 = CompositionContext(ArrayCompositor(), "Array Composition Context")
    ctx1.default()
    ctx1.repair()
    ctx1.traverse()

    val ctx2 = CompositionContext(SimpleCompositor(), "Simple Composition Context")
    ctx2.default()
    ctx2.repair()
    ctx2.traverse()
}