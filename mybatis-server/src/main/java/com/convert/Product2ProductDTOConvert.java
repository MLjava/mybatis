package com.convert;

import com.dto.ProductDTO;
import com.enums.ProductEnum;
import com.exception.ProductException;
import com.pojo.Product;

/**
 * @author：linma
 * @date: 2018/10/25 22:48
 * @email: linma@homeinns.com
 **/
public class Product2ProductDTOConvert {

    public static ProductDTO covert(Product product) {
        if (null == product) {
            throw new ProductException(ProductEnum.PRODUCT_NOT_NULL);
        }
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setProductName(product.getProductName());
        productDTO.setProductPrice(product.getProductPrice());
        productDTO.setProductCategory(product.getProductCategory());
        productDTO.setProductInventory(product.getProductInventory());
        return productDTO;
    }

}
