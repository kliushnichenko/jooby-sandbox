package io.jooby.demo;

import io.jooby.demo.v1.ControllerV1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
  @Test
  public void welcome() {
    ControllerV1 controller = new ControllerV1();
    assertEquals("Welcome to Jooby!", controller.sayHi());
  }
}
