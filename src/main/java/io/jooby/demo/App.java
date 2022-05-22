package io.jooby.demo;

import io.jooby.Jooby;
import io.jooby.OpenAPIModule;
import io.jooby.demo.v1.ControllersAppV1;
import io.jooby.demo.v2.ControllersAppV2;
import io.jooby.di.GuiceModule;

public class App extends Jooby {

    {
        install(new GuiceModule());
        install(new OpenAPIModule());

        mvc(HealthController.class);

        mount("/api/v1", new ControllersAppV1());
        mount("/api/v2", new ControllersAppV2());
    }

    public static void main(final String[] args) {
        runApp(args, App::new);
    }

}
