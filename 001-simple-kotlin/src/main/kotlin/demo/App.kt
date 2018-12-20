package demo

class App {
    // Kotlin supports specifying default arguments
    // Kotlin also supports string interpolation with `$`.
    fun greet(name: String = "world") = "Hello, $name."
}

// Main functions in Kotlin are written outside of any class.
fun main(args: Array<String>) {
    println(App().greet("SpotHero"))
}
