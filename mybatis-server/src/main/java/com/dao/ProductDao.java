package com.dao;

import com.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @@author：linma
 * @date: 2018/10/24 14:09
 * @email: linma@homeinns.com
 */
@Mapper
@Repository
public interface ProductDao {

    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
}