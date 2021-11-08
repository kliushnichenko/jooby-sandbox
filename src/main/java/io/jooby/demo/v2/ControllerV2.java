package io.jooby.demo.v2;

import io.jooby.annotations.GET;
import io.jooby.annotations.Path;
import io.jooby.demo.WelcomeService;

import javax.inject.Inject;

@Path("/")
public class ControllerV2 {

  @Inject
  private WelcomeService welcomeService;

  @GET("/welcome")
  public String sayHi() {
    return welcomeService.welcome("v2");
  }
}
