package io.jooby.demo;

import io.jooby.Context;
import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

import java.util.Map;

@Path("/")
public class HealthController {

  @GET("/healthcheck")
  public void healthCheck(Context ctx) {
    ctx.setResponseCode(200).render(Map.of("status", "Ok"));
  }
}
