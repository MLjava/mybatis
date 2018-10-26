package com.dao;

import com.MyBatisApplicationTests;
import com.pojo.Product;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author：linma
 * @date: 2018/10/24 14:02
 * @email:linma@homeinn.com
 **/
public class ProductDaoTest extends MyBatisApplicationTests {

    @Autowired
    private ProductDao productDao;

    @Test
    public void selectByPrimaryKey() {
        System.out.println(productDao.findProductById(1));
    }

    @Test
    public void insertProduct() {
        Product product = new Product();
        product.setProductCategory("dd");
        product.setProductName("dd");
        product.setUpdateTime(new Date());
        product.setProductInventory(22);
        product.setProductPrice(BigDecimal.valueOf(22.2));
        System.out.println(productDao.insertProduct(product));
    }

    @Test
    public void fuzzySearchProductByName() {
        List<Product> product = productDao.fuzzySearchProductByName("电");
        System.out.println(product);
    }

    @Test
    public void updateProduct() {
        Product product = new Product();
        product.setProductName("好舒服浴巾");
        product.setProductPrice(BigDecimal.valueOf(199.99));
        product.setId(3);
        product.setUpdateTime(new Date());
        Integer integer = productDao.updateProduct(product);
        System.out.println(integer);
    }
}