package com.example.helloworld;

public class HelloWorld {

    private final PhraseService _phraseService;

    public HelloWorld(PhraseService phraseService) {
        _phraseService = phraseService;
    }

    public String sayHelloWorld() {
        return _phraseService.sayPhrase();
    }
}