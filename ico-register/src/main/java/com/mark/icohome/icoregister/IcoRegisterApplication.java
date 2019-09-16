package com.mark.icohome.icoregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class IcoRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcoRegisterApplication.class, args);
    }

}
