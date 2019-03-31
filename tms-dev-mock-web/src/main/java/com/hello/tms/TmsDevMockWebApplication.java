package com.hello.tms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TmsDevMockWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmsDevMockWebApplication.class, args);
    }

}
