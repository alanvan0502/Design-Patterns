class Adapter: Target, Adaptee() {

    override fun request() {
        specificRequest()
    }
}