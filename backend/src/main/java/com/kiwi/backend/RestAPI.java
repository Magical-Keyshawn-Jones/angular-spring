package com.kiwi.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {
    
    @GetMapping("/yes")
    public Person createPerson() {
        Person newPerson = new Person();
        newPerson.setName("Kiwi");
        newPerson.setAge(16);
        return newPerson;
    }
}
