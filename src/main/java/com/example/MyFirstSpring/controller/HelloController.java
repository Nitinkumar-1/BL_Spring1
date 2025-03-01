package com.example.MyFirstSpring.controller;

import com.example.MyFirstSpring.model.Message;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from BridgeLabz";
    }

    @GetMapping("/query")
    public String sayHello(@RequestParam String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String sayHellopath(@PathVariable String name) {
        return "Hello " + name + " from BridgeLabz";
    }
    @PostMapping("post")
    public String greetWithRequestBody(@RequestBody Message names){
        return "Hello, "+names.getFirstName()+" "+names.getLastName();
    }

}


