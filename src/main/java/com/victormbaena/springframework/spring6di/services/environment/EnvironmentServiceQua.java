package com.victormbaena.springframework.spring6di.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class EnvironmentServiceQua implements EnvironmentService{
    @Override
    public String getEnv() {
        return "qa";
    }
}
