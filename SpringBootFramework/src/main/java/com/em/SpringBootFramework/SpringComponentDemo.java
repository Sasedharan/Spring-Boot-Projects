package com.em.SpringBootFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringComponentDemo {
    @Autowired
    private SpringComponentDemo2 sDemo2;
    public String message() {
        sDemo2.message2();
        return " Java-Class connect with spring as component";

    }

}
