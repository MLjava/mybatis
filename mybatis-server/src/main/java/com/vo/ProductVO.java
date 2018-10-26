package com.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author：linma
 * @date: 2018/10/24 15:01
 * @email: linma@homeinns.com
 **/
@Data
public class ProductVO {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("category")
    private String productCategory;

    @JsonProperty("inventory")
    private Integer productInventory;
}
