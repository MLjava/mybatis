package com.services.impl;

import com.pojo.Product;
import com.services.DemoService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @author：linma
 * @date: 2018/12/21 14:13
 * @email: linma@homeinns.com
 **/
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public List<String> findList() {
        return new ArrayList<>();
    }

    @Override
    public Map<String, String> findMap() {
        return new HashMap<>();
    }

    @Override
    public Set<String> findSet() {
        return new HashSet<>();
    }

    @Override
    public Product findNull() {
        return null;
    }
}
