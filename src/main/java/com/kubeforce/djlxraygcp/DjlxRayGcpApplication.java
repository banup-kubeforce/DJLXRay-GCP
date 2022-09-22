package com.kubeforce.djlxraygcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DjlxRayGcpApplication {

    public static void main(String[] args) {
        SpringApplication.run(DjlxRayGcpApplication.class, args);
    }

    @Bean
    public XRAYFunction xrayFunction() {
        return new XRAYFunction();
    }
}
