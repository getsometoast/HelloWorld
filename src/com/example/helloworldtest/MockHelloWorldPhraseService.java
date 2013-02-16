package com.example.helloworldtest;

import com.example.helloworld.PhraseService;

public class MockHelloWorldPhraseService implements PhraseService {

    private boolean _sayPhraseCalled = false;

    @Override
    public String sayPhrase() {
        _sayPhraseCalled = true;
        return "Hello World";
    }

    public boolean sayPhraseWasCalled() {
        return _sayPhraseCalled;
    }
}
