package com.dao;

import com.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    /**
     * 查询所有的产品信息
     *
     * @return
     */
    List<Product> findProductAll();

    /**
     * 根据商品名称查询商品信息
     *
     * @param productName
     * @return
     */
    List<Product> fuzzySearchProductByName(String productName);

    /**
     * 更新产品信息
     *
     * @param product
     * @return
     */
    Integer updateProduct(Product product);

}
