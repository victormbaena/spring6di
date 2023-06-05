package com.victormbaena.springframework.spring6di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class GreetingServicePrimaryImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Primary Service!!!";
    }
}
