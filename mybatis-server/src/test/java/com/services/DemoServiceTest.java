package com.services;

import com.controller.MybatisApplicationControllerTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/12/21 14:17
 * @email: linma@homeinns.com
 **/
public class DemoServiceTest extends MybatisApplicationControllerTests {

    @Autowired
    private DemoService demoService;


    @Test
    public void findList() {
        System.out.println(demoService.findList());
    }

    @Test
    public void findMap() {
        System.out.println(demoService.findMap());
    }

    @Test
    public void findSet() {
        System.out.println(demoService.findSet());
    }

    @Test
    public void findNull() {
        System.out.println(demoService.findNull());
    }
}