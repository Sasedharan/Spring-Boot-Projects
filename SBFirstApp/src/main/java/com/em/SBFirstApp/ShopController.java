package com.em.SBFirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShopController {
                                     // without "/Shop" path, we can get Json response in localhost:8080 itself
    @GetMapping("/Shop")          // spring MVC internally uses to convert HTTP to Json format in application
    public Shop shopDetails() {
        return new Shop("Flipkart", "Chennai");
                                                    // here return as Shop java bean object ,  as HTTP --> Json
    }

                                   /* Spring MVC commonly convert the Java object to json and json object to Java
                                     By default, the Spring MVC convert the Java object to Json format representation.
                                     we can change it to XML format as need. (path = "/Shop",*/
    @GetMapping("/Shoplist")
    public List<Shop> entireShopDetails() {
        List<Shop> l = new ArrayList<>();
        l.add(new Shop("Amazon","Trichy"));
        l.add(new Shop("KGF","Pondy"));
        l.add(new Shop("Le","Vellure"));
        l.add(new Shop("Raw","Madurai"));
        return l;
    }
    @GetMapping("/Shop/{name}/{location}")               // pathvariable used to bind the data as method arg
    public Shop shopUsingPath(@PathVariable("name") String sname,
                              @PathVariable("location") String slocation){
        return new Shop(sname,slocation);
    }
    @GetMapping("/Shop/query")
    public Shop shopUsingQueryParam(@RequestParam(name = "name") String sname,
                                    @RequestParam(name = "location") String slocation){
        return new Shop(sname,slocation);
    }
}