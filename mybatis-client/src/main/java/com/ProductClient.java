package com;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author：linma
 * @date: 2018/10/30 13:45
 * @email: linma@homeinns.com
 **/
@FeignClient(value = "MyBatis")
public interface ProductClient {
}
