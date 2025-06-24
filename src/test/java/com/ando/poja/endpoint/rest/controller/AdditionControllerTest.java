package com.ando.poja.endpoint.rest.controller;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionControllerTest {

    private final AdditionController subject = new AdditionController();

    @Test
    public void addition_test() {
        assertEquals(3, subject.add(1,2));
    }
}
