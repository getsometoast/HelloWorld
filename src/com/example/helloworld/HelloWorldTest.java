package com.example.helloworld;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class HelloWorldTest {

    private final String EXPECTED_PHRASE = "Hello World";

    private PhraseService mockPhraseService;
    private HelloWorld systemUnderTest;

    @Before
    public void createSystemUnderTest(){
        mockPhraseService = mock(PhraseService.class);
        systemUnderTest = new HelloWorld(mockPhraseService);

        when(mockPhraseService.sayPhrase()).thenReturn(EXPECTED_PHRASE);
    }

    @Test
    public void should_return_hello_world_string() {

        String result = systemUnderTest.sayHelloWorld();

        assertEquals(EXPECTED_PHRASE, result);
    }

    @Test
    public void should_call_hello_world_phrase_service() {

        systemUnderTest.sayHelloWorld();

        verify(mockPhraseService).sayPhrase();
    }
}

