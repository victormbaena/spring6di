package com.victormbaena.springframework.spring6di.controllers;

import com.victormbaena.springframework.spring6di.services.GreetingService;
import com.victormbaena.springframework.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * Created by jt, Spring Framework Guru.
 */
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        System.out.println("MyController.Constructor");
        this.greetingService = new GreetingServiceImpl();
    }
    public String sayHello(){
        System.out.println("I'm in the controller");

        return greetingService.sayGreeting();
    }

    public void beforeInit(){
        System.out.println("## - Before Init - Called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
