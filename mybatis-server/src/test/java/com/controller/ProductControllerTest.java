package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

/**
 * @author：linma
 * @date: 2018/12/21 12:04
 * @email: linma@homeinns.com
 **/
@Slf4j
public class ProductControllerTest extends MybatisApplicationControllerTests {

    @Test
    public void getProductById() throws Exception {
        String result = mockMvc.perform(MockMvcRequestBuilders.get("/homeinns/getproductbyid")
            .param("productId", "1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();
        log.info("{}:result====>" + result);
    }
}