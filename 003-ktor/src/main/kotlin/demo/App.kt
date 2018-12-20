package demo

import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import demo.routes.HealthCheckRoutes
import demo.routes.WidgetRoutes
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.routing.routing
import java.time.Clock

fun Application.main() {
    val widgets = WidgetRoutes(Clock.systemUTC())
    val healthCheck = HealthCheckRoutes()

    install(ContentNegotiation) {
        jackson {
            registerModule(JavaTimeModule())
            disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
        }
    }

    routing(widgets.routes)
    routing(healthCheck.routes)
}
