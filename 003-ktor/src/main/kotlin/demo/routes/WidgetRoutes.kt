package demo.routes

import demo.domain.Widget
import demo.domain.WidgetColor
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.routing.Routing
import io.ktor.routing.get
import io.ktor.routing.route
import java.time.Clock

class WidgetRoutes(private val clock: Clock) {
    val routes: Routing.() -> Unit = {
        route("/widgets") {
            get("/{id}") {
                val id = call.parameters["id"]?.toLong()!!
                call.respond(Widget(id, WidgetColor.RED, clock.instant()))
            }
        }
    }
}

