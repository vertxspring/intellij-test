package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class TestController {


    @RequestMapping("/greeting")
    public String hello(){
        Product p = new Product();
        p.getId();
        return "Hello...";
    }
}
