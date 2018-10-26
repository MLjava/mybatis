package com.pojo;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;

/**
 * @author：linma
 * @date: 2018/10/24 14:09
 * @email: linma@homeinns.com
 */
@Data
public class Product {

    private Integer id;

    @NotBlank(message = "商品名称不可以为空！")
    private String productName;

    @NotNull(message = "商品价格不可以为空！")
    @Min(value = 0)
    private BigDecimal productPrice;

    @NotBlank(message = "商品分类不可以位空!")
    private String productCategory;
}