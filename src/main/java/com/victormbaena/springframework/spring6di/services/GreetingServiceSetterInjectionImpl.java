package com.victormbaena.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("setterGreetingInjection")
public class GreetingServiceSetterInjectionImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hey I'm Setting a Greeting!!!";
    }
}
