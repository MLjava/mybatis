package com.services;

import com.dto.ProductDTO;
import com.pojo.Product;

import java.util.List;

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

    /**
     * 分页查询
     *
     * @param startPage 开始页
     * @param pageSize 每页要显示的页数
     * @return
     */
    List<ProductDTO> findProductAll(Integer startPage, Integer pageSize);

    /**
     * 跟新产品信息
     *
     * @param product
     * @return
     */
    boolean updateProduct(ProductDTO productDTO);

    /**
     * 删除商品信息
     *
     * @param productId
     * @return
     */
    boolean deleteProduct(Integer productId);
}
