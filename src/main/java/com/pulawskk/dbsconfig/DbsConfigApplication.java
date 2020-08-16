package com.pulawskk.dbsconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DbsConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DbsConfigApplication.class, args);
    }

}
