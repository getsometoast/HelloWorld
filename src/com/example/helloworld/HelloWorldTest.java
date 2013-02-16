package com.example.helloworld;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HelloWorldTest {
    @Test
    public void should_return_hello_world_string() {

        MockHelloWorldPhraseService phraseService = new MockHelloWorldPhraseService();
        HelloWorld systemUnderTest = new HelloWorld(phraseService);

        String result = systemUnderTest.sayHelloWorld();

        assertEquals("Hello World", result);
    }

    @Test
    public void should_call_hello_world_phrase_service() {

        MockHelloWorldPhraseService phraseService = new MockHelloWorldPhraseService();
        HelloWorld systemUnderTest = new HelloWorld(phraseService);

        String result = systemUnderTest.sayHelloWorld();

        assertTrue(phraseService.sayPhraseWasCalled());
    }
}

interface PhraseService{
    String sayPhrase();
}

