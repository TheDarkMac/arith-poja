package com.ando.poja.endpoint.rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AdditionControllerTest {

  private final AdditionController subject = new AdditionController();

  @Test
  public void addition_test() {
    assertEquals(3, subject.add(1, 2));
  }
}
