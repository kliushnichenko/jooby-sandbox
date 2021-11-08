package io.jooby.demo;

public class WelcomeService {

    public String welcome(String version) {
        return "[API " + version + "] Welcome Jooby!";
    }
}
