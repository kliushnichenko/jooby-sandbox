package io.jooby.demo.v1;

import io.jooby.Jooby;

public class ControllersAppV1 extends Jooby {

    public ControllersAppV1() {
        mvc(ControllerV1.class);
    }
}
