package io.jooby.demo.v1;

import io.jooby.annotations.*;

@Path("/")
public class ControllerV1 {

  @GET("/welcome")
  public String sayHi() {
    return "[API v1] Welcome to Jooby!";
  }
}
