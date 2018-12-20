package demo.routes

import io.ktor.application.call
import io.ktor.http.HttpStatusCode
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get

class HealthCheckRoutes {
    val routes: Routing.() -> Unit = {
        get("/health") {
            call.respond(
                HttpStatusCode.OK,
                mapOf(
                    "healthy" to true
                )
            )
        }
    }
}
