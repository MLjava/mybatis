package com.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author：linma
 * @date: 2018/10/26 10:17
 * @email: linma@homeinns.com
 **/
@Data
public class Product {

    private Integer id;

    private String productName;

    private BigDecimal productPrice;

    private String productCategory;

    private Integer productInventory;

    private Date updateTime;

    private Integer flag;
}
