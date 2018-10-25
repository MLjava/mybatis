package com.dao;

import com.MyBatisApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
        System.out.println(productDao.selectByPrimaryKey(1));
    }
}