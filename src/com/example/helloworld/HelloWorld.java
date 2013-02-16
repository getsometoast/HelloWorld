package com.example.helloworld;

public class HelloWorld {

    private final PhraseService phraseService;

    public HelloWorld(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    public String sayHelloWorld() {
        return phraseService.sayPhrase();
    }
}