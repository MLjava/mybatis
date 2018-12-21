package com.abstracts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author：linma
 * @date: 2018/10/24 16:28
 * @email: linma@homeinns.com
 **/
public abstract class AbstractService {

    /**
     * 校验分页字段
     *
     * @param startPage 起始页
     * @param pageSize 每页要显示的数据
     * @return
     */
    protected Map<String, Integer> validatePager(Integer startPage, Integer pageSize) {
        Map<String, Integer> map = new HashMap<>(16);
        if (startPage == null ||startPage <= 0) {
            startPage = 1;
        }
        if (pageSize == null || pageSize <= 0) {
            pageSize = 5;
        }
        map.put("startPage", startPage);
        map.put("pageSize", pageSize);
        return map;
    }
}
