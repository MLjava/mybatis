package com.services;

import com.dto.ProductDTO;

/**
 * @author：linma
 * @date: 2018/10/24 14:09
 * @email: linma@homeinns.com
 **/
public interface ProductService {

    /**
     * 根据商品id，获取商品信息
     *
     * @param id 商品id
     * @return 商品信息
     */
    ProductDTO getProductBId(Integer id);

    /**
     * 插入商品信息
     *
     * @param productDTO
     * @return
     */
    boolean insertProduct(ProductDTO productDTO);
}
