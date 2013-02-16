package com.example.helloworld;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void should_return_hello_world_string() {

        HelloWorld systemUnderTest = new HelloWorld();
        String result = systemUnderTest.sayHelloWorld();

        assertEquals("Hello World", result);
    }
}