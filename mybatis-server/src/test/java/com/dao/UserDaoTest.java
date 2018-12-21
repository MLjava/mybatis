package com.dao;

import com.MyBatisApplicationTests;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author：linma
 * @date: 2018/12/21 10:38
 * @email: linma@homeinns.com
 **/
public class UserDaoTest extends MyBatisApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
        public void findById() {
        System.out.println(userDao.selectByPrimaryKey(1L));
    }

}