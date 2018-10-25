package com.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @author：linma
 * @date: 2018/10/25 17:50
 * @email:linma@homeinn.com
 **/
@FeignClient("MyBatis")
@Component
public interface ProductClient {



}
