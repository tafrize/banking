package com.project.bankingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class BankingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankingServerApplication.class, args);
    }

}