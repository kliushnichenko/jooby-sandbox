package io.jooby.demo;

import io.jooby.Context;
import io.jooby.annotations.GET;
import io.jooby.annotations.Path;

import javax.inject.Inject;
import java.util.Map;

@Path("/")
public class HealthController {

    @Inject
    private WelcomeService welcomeService;

    @GET("/healthcheck")
    public void healthCheck(Context ctx) {
        String welcome = welcomeService.welcome("healthcheck");
        ctx.setResponseCode(200)
                .render(Map.of(
                        "status", "Ok",
                        "welcome", welcome)
                );
    }
}
