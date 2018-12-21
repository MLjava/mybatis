package com.services;

import com.pojo.Product;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author：linma
 * @date: 2018/12/21 14:15
 * @email: linma@homeinns.com
 **/
public interface DemoService {

    List<String> findList();

    Map<String, String> findMap();

    Set<String> findSet();

    Product findNull();
}
