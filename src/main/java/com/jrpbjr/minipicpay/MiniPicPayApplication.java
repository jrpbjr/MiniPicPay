package com.jrpbjr.minipicpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MiniPicPayApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiniPicPayApplication.class, args);
    }

}
