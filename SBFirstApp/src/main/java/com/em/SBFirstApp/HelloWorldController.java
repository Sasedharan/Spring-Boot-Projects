package com.em.SBFirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller                                             - both combined in single annotation
//@ResponseBody
@RestController
public class HelloWorldController {
    @GetMapping("/home")                                // to get HTTP method
    public String message(){                               // http:localhost:8080/home
        return "Hello World - Im new to Spring Boot";
    }
}
