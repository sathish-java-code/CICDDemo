package com.example.springbootcicddemo.springbootcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootCicdApplication.class, args);
    }


    @GetMapping("/hi")
    public String hi() {
        return "Javas Springboot CICD Demo Created Sucessfully and API added!";
    }

}
