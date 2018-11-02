package singleton

fun main(args: Array<String>){
    Singleton.printSomething()
    Singleton.instance.instancePrint()
}

class Singleton(){
    companion object {
        val instance = Singleton()
        fun printSomething() {
            System.out.println("hello world!")
        }
    }

    fun instancePrint(){
        System.out.println("hello singleton!")
    }

}