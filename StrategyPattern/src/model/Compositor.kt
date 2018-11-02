package model

abstract class Compositor {
    open fun compose() {
        print("Default composition behavior")
    }

    open fun compose(ctx: CompositionContext) {
        println("Name from context - " + ctx.getName() + ":")
        compose()
    }

    open fun compose(str: String) {
        println("Name from parameter - $str: ")
        compose()
    }

}