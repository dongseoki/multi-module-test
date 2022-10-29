package com.example.demo;

import com.example.demo.entity.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        Member member= new Member();
        return "hello admin";
    }
}
