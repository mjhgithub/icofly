package com.mark.icohome.icoapi;

import com.mark.icohome.icocore.utils.ResultUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class IcoApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(IcoApiApplication.class, args);
    }

    @RequestMapping("/health/check")
    public Mono healthCheck() {
        return Mono.just(ResultUtils.success());
    }

}
