package com.em.springboot.Controller;

import com.em.springboot.Entity.Product;
import com.em.springboot.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;
    @PostMapping("/Product")
    public Product insertItem(@RequestBody Product product){
      return service.inserItem(product);
    }
    @GetMapping("/Product/{id}")
    public Product getItem(@PathVariable ("id") int idno){
        return service.getItem(idno);

    }
    @PutMapping("/Product/{id}")
    public Product updateItem(@PathVariable("id")@RequestBody Product product) {
        return service.updateItem(product);
    }
    @DeleteMapping("/Product/{id}")
    public String deleteItem(@PathVariable("id") int idno){
         service.deleteItem(idno);
         return "Item Deleted Successfully";
    }
    @GetMapping("/Product")
    public List<Product> displayProduct(Product product){
        return service.displayProduct(product);

    }
}
