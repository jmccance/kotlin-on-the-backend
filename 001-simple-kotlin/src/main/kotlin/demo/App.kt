package demo

class App {
    fun greet(name: String = "world") = "Hello, $name."
}

fun main(args: Array<String>) {
    println(App().greet("SpotHero"))
}
