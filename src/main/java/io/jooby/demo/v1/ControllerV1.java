package io.jooby.demo.v1;

import io.jooby.annotations.*;
import io.jooby.demo.WelcomeService;

import javax.inject.Inject;

@Path("/")
public class ControllerV1 {

  @Inject
  private WelcomeService welcomeService;

  @GET("/welcome")
  public String sayHi() {
    return welcomeService.welcome("v1");
  }

  @GET("/should-not-be-duplicated-under-v2")
  public String demo() {
    return welcomeService.welcome("v1");
  }
}
