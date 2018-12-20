package demo;

import com.fasterxml.jackson.databind.SerializationFeature;
import demo.resources.WidgetResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;
import java.time.Clock;

public class App extends Application<Configuration> {
  public static void main(String... args) throws Exception {
    new App().run(args);
  }

  @Override
  public void run(Configuration configuration, Environment environment) {
    environment.jersey().register(new WidgetResource(Clock.systemUTC()));
    environment.getObjectMapper().disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
  }
}
