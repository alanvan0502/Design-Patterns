class Client(private val target: Target) {
    fun clientRequest() {
        target.request()
    }
}