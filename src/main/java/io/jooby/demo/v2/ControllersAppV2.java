package io.jooby.demo.v2;

import io.jooby.Jooby;

public class ControllersAppV2 extends Jooby {

    public ControllersAppV2() {
        mvc(ControllerV2.class);
    }
}
