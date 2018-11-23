package com.services;

import com.MyBatisApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author：linma
 * @date: 2018/10/25 9:43
 * @email:linma@homeinn.com
 **/
public class ProductServiceTest extends MyBatisApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void getProductBId() {
        System.out.println(productService.getProductBId(1));
    }
}