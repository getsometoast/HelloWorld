package com.example.helloworldtest;

import com.example.helloworld.HelloWorld;
import com.example.helloworld.PhraseService;
import com.sun.javafx.collections.MappingChange;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
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

    @Test
    public void should_do_something_with_a_collection(){

        List aCollection = new LinkedList();

        Object something = new Object();
        Object somethingElse = new Object();

        aCollection.add(something);
        aCollection.add(something);
        aCollection.add(somethingElse);

        Set result = systemUnderTest.doSomethingWithCollection(aCollection);

        assertTrue(result.size() == 2); // should be unique - no duplicate objects.
    }
}

