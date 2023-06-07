package com.victormbaena.springframework.spring6di.controllers.environment;


import com.victormbaena.springframework.spring6di.services.environment.EnvironmentService;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentController {

    private final EnvironmentService environmentService;


    public EnvironmentController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String getEnvironment() {
        return "You are in " + environmentService.getEnv() + " Environment";
    }
}
