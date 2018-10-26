package com.dao;

import com.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author：linma
 * @date: 2018/10/26 10:18
 * @email: linma@homeinns.com
 **/
@Mapper
@Repository
public interface ProductDao {

    /**
     * 根据产品id查询产品信息
     *
     * @param productId
     * @return
     */
    Product findProductById(Integer productId);

    /**
     * 插入产品信息
     *
     * @param product
     * @return
     */
    Integer insertProduct(Product product);

}
