package com;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author：linma
 * @date: 2018/10/26 9:32
 * @email: linma@homeinns.com
 **/
@Data
public class ShoppingCar {

    private Integer productId;

    private String productName;

    private BigDecimal productPrice;

}
