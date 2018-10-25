package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author：linma
 * @date: 2018/10/24 11:30
 * @email:linma@homeinn.com
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisApplicationTests {

    @Test
    public void context() {
        System.out.println("欢迎来到编程世界！" + true);
    }

}
