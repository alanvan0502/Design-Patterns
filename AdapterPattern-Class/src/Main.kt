fun main(args: Array<String>) {
    val target: Target = Adapter()
    val client = Client(target)

    client.clientRequest()
}