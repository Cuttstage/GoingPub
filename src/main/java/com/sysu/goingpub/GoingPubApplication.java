package com.sysu.goingpub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan("com.sysu.goingpub")
@SpringBootApplication
public class GoingPubApplication {
    public static void main(String[] args){
        SpringApplication.run(GoingPubApplication.class, args);
    }
}
