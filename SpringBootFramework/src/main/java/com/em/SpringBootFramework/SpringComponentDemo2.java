package com.em.SpringBootFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringComponentDemo2 {
    @Bean
    public void message2(){
       // System.out.println("Configuration of Java-Class as Spring");
        System.out.println("Components as connected by AUTOWIRED");
    }
}
