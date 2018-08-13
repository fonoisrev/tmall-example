package com.github.fonoisrev.test.test;

import com.github.fonoisrev.tmall.bean.Product;
import com.github.fonoisrev.tmall.repository.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
@AutoConfigureTestDatabase
public class ProductRepositoryTest {

    @Autowired
    ProductRepository repository;
    
    @Test
    public void test() {
        Product product = new Product();
        product.setName("示例产品1");
        product.setPrice(99.5f);
        product.setStock(1);
        repository.save(product);
        product = new Product();
        product.setName("示例产品2");
        product.setPrice(100.0f);
        product.setStock(2);
        repository.save(product);
    
        List<Product> allProducts = repository.findAll();
        Assert.assertEquals(allProducts.size(), 2);
        
        Product queryProduct = repository.findByName("示例产品2");
        Assert.assertEquals(queryProduct.getPrice(), 100.0, 0.1);
        System.out.println("示例产品2.id = " + queryProduct.getId());
    }
}
