package com.victormbaena.springframework.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjectedImpl implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Friends don´t let friends to property injection!!!";
    }
}
