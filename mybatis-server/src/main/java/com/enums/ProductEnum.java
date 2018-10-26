package com.enums;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/10/24 17:41
 * @email: linma@homeinns.com
 **/
@Getter
public enum ProductEnum {

    /**
     * 产品id不可以位空
     */
    PRODUCT_ID_IS_NOT_NULL(0, "商品id不可以位空！"),

    /**
     * 商品不存在
     */
    PRODUCT_NOT_EXIST(1, "实在抱歉，您搜索的商品不存在！"),

    /**
     * 输入商品信息不可以位空！
     */
    PRODUCT_NOT_NULL(2, "输入商品信息不可以为空！"),

    /**
     * 商品名称不可以位空！
     */
    PRODUCT_NAME_NOT_NULL(3, "商品名称不可以位空！"),

    /**
     * 库存现在没有商品，等待上架！
     */
    PRODUCT_IS_EMPTY(4, "库存现在没有商品，等待上架！");

    private Integer code;

    private String message;

    ProductEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
