package com.example.helloworld;

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
