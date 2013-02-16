package com.example.helloworld;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

    private MockHelloWorldPhraseService mockPhraseService;
    private HelloWorld systemUnderTest;

    @Before
    public void createSystemUnderTest(){
        mockPhraseService = new MockHelloWorldPhraseService();
        systemUnderTest = new HelloWorld(mockPhraseService);
    }

    @Test
    public void should_return_hello_world_string() {

        String result = systemUnderTest.sayHelloWorld();

        assertEquals("Hello World", result);
    }

    @Test
    public void should_call_hello_world_phrase_service() {

        systemUnderTest.sayHelloWorld();

        assertTrue(mockPhraseService.sayPhraseWasCalled());
    }
}

