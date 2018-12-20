package demo.resources

import demo.domain.Widget
import demo.domain.WidgetColor
import java.time.Clock
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("/widgets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class WidgetResource(private val clock: Clock) {
    @GET
    @Path("/{id}")
    fun get(@PathParam("id") id: Long): Widget = Widget(id, WidgetColor.RED, clock.instant())
}
