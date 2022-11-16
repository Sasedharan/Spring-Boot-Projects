package com.em.SBcrudProject.Repository;

import com.em.SBcrudProject.Entity.Products;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class ProductsRepositoryTest {

@Autowired
    private ProductsRepository proRepository;

@Test
    void saveproduct(){

        /*Products pro = new Products();
        pro.setItemName("Fridge");
        pro.setQCheck("Approved");
        pro.setQuantity(2);
        pro.setRate(15000);*/

        Products pro = Products.builder()
                .itemName("Fridge").qCheck("Approved").quantity(9).rate(15000).build();
        proRepository.save(pro).getSrNo();

    }
@Test
    void updateProduct(){
    Integer id = 1;
    //Long id = 1L; findById --> long type not found
    Products product = proRepository.findById(id).get();
    product.setItemName("Washing Machine");
    product.setQuantity(1);
    product.setQCheck("Checked");
    product.setRate(15000);
    proRepository.save(product);
    }
    @Test
    void findProduct(){
    Integer id = 1;
    Products pro = proRepository.findById(id).get();
    }
    @Test
    void saveall(){
        Products pro = new Products();
        pro.setItemName("Fan");
        pro.setQCheck("Approved");
        pro.setQuantity(10);
        pro.setRate(3000);

        Products pro1 = new Products();
        pro1.setItemName("Table Fan");
        pro1.setQCheck("Checked");
        pro1.setQuantity(20);
        pro1.setRate(2000);
        proRepository.saveAll(List.of(pro,pro1));
    }
    @Test
    void deletproductbyid(){
    Integer id = 1;
    proRepository.deleteById(id);
    }
}