package demo.resources;

import demo.domain.Widget;
import demo.domain.WidgetColor;
import java.time.Clock;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/widgets")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WidgetResource {

  private final Clock clock;

  public WidgetResource(Clock clock) {

    this.clock = clock;
  }

  @GET
  @Path("/{id}")
  public Widget get(@PathParam("id") Long id) {
    return new Widget(id, WidgetColor.BLUE, clock.instant());
  }
}
