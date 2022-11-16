package com.em.SBFirstLogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingDemo {

    Logger logger = LoggerFactory.getLogger(LoggingDemo.class);
    @RequestMapping("/")
    public String Message(){
        logger.info("Logging Test");


        return "Hello - Logging Demo Practise";
    }
}
