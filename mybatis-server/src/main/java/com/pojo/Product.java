package com.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author：linma
 * @date: 2018/10/24 14:09
 * @email:linma@homeinn.com
 */
@Data
public class Product {

    private Integer id;

    private String productName;

    private BigDecimal productPrice;

    private String productCategory;
}