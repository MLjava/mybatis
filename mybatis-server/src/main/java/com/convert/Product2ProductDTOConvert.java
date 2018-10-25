package com.convert;

import com.dto.ProductDTO;
import com.pojo.Product;
import lombok.NonNull;

/**
 * @author：linma
 * @date: 2018/10/25 22:48
 * @email:linma@homeinn.com
 **/
public class Product2ProductDTOConvert {

    public static ProductDTO covert(@NonNull Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(product.getProductName());
        productDTO.setProductPrice(product.getProductPrice());
        productDTO.setProductCategory(product.getProductCategory());
        return productDTO;
    }

}
