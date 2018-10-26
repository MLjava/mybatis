package com.dto;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author：linma
 * @date: 2018/10/25 9:46
 * @email: linma@homeinns.com
 **/
@Data
public class ProductDTO {

    private Integer id;

    private String productName;

    private BigDecimal productPrice;

    private String productCategory;
}
