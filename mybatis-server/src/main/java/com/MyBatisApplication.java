package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author：linma
 * @date: 2018/10/24 11:28
 * @email: linma@homeinns.com
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
public class MyBatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisApplication.class);
    }
}
