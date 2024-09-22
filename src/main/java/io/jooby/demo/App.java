package io.jooby.demo;

import io.avaje.validation.Validator;
import io.jooby.Jooby;

public class App extends Jooby {

    private final Validator validator = Validator.builder().build();

    {
        onStarted(() -> {
            var pet = new Pet();
            validator.validate(pet);
        });
    }

    public static void main(final String[] args) {
        runApp(args, App::new);
    }

}
