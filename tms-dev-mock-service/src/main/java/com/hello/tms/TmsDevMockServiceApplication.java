package com.hello.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TmsDevMockServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsDevMockServiceApplication.class, args);
    }

}
