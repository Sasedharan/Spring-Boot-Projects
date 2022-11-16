package com.em.springboot.Service;

import com.em.springboot.Entity.Product;
import com.em.springboot.Repository.ProductRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
   @Autowired
    private ProductRepositoryInterface repositoryInt;


    public Product inserItem(Product product) {
        return repositoryInt.save(product);
    }


    public Product getItem(int idno) {
        return repositoryInt.findById(idno).get();

    }

    public Product updateItem(Product product) {
        return repositoryInt.save(product);
    }

    public void deleteItem(int idno) {
         repositoryInt.deleteById(idno);
    }

    public List<Product> displayProduct(Product product) {
        return repositoryInt.findAll();
    }
}

