package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Objects;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "world") String name) {
        return String.format("Hello, %s!", name);
    }

    @GetMapping("/about")
    public String aboutUs() {
        return "About us";
    }

    @GetMapping("/options")
    public String getOption(@RequestParam(value = "opt", defaultValue = "") String opt) {
        if (!Objects.equals(opt, ""))
            return "not an option";
        return "options";
    }

}
