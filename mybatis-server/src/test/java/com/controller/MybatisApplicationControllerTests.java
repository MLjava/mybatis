package com.controller;

import com.MyBatisApplicationTests;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author：linma
 * @date: 2018/12/21 12:02
 * @email: linma@homeinns.com
 **/
public class MybatisApplicationControllerTests extends MyBatisApplicationTests {

    @Autowired
    protected WebApplicationContext wac;

    protected MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
}
