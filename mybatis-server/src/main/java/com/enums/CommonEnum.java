package com.enums;

import lombok.Getter;

/**
 * @author：linma
 * @date: 2018/12/21 13:58
 * @email: linma@homeinns.com
 **/
@Getter
public enum CommonEnum {

    /**
     * 数据没找到
     */
    NOT_FOUND_DATA(404, "没有查到数据！");

    private Integer code;

    private String message;

    CommonEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
