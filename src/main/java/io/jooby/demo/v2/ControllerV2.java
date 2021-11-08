package io.jooby.demo.v2;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

@Path("/")
public class ControllerV2 {

  @GET("/welcome")
  public String sayHi() {
    return "[API v2] Welcome to Jooby!";
  }
}
