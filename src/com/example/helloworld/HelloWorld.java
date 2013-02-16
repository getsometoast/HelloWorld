package com.example.helloworld;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HelloWorld {

    private final PhraseService phraseService;

    public HelloWorld(PhraseService phraseService) {
        this.phraseService = phraseService;
    }

    public String sayHelloWorld() {
        return phraseService.sayPhrase();
    }

    public Set doSomethingWithCollection(List collection) {

        if(collection.isEmpty())
            return new HashSet();

        return new HashSet(collection);
    }
}