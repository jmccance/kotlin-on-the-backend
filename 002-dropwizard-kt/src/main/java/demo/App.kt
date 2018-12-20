package demo

import com.fasterxml.jackson.databind.SerializationFeature
import demo.resources.LegacyResource
import demo.resources.WidgetResource
import io.dropwizard.Application
import io.dropwizard.Configuration
import io.dropwizard.setup.Environment
import java.time.Clock

class WidgetApp : Application<Configuration>() {
    override fun run(configuration: Configuration, environment: Environment) {
        // `with` Lets us write a block treating its argument as the receiver.
        // All the calls inside the `with` block are implicitly using `environment` as `this`.
        // `with` is _not_ keyword; it's just a regular function:
        //     fun with<A, B>(receiver: A,  block: A.() -> B): B
        with(environment) {
            // Inject our resource
            with(jersey()) {
                register(WidgetResource(Clock.systemUTC()))
                register(LegacyResource(Clock.systemUTC()))
            }

            // Write timestamps in ISO format
            objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
        }
    }
}

// Main functions in Kotlin are written outside of any class.
fun main(args: Array<String>) {
    // *args "spreads" the args array so it can be used as a varargs argument
    WidgetApp().run(*args)
}
