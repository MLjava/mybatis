package com.services.impl;

import com.abstracts.AbstractService;
import com.dao.ProductDao;
import com.dto.ProductDTO;
import com.enums.ProductEnum;
import com.exception.HomeinnsException;
import com.exception.ProductException;
import com.pojo.Product;
import com.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author：linma
 * @date: 2018/10/24 14:11
 * @email: linma@homeinns.com
 **/
@Service
@Slf4j
public class ProductServiceImpl extends AbstractService implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public ProductDTO getProductBId(Integer id) {
        if (id == null) {
            throw new ProductException(ProductEnum.PRODUCT_ID_IS_NOT_NULL);
        }
        log.info("==== 根据商品id查询商品具体信息！ ====");
        Product product = productDao.findProductById(id);
        if (product == null) {
            throw new ProductException(ProductEnum.PRODUCT_NOT_EXIST);
        }
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product, productDTO);
        return productDTO;
    }

    @Override
    @Transactional(rollbackFor = HomeinnsException.class)
    public boolean insertProduct(ProductDTO productDTO) {
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);
        log.info("==== 增加商品信息！ ====");
        product.setUpdateTime(new Date());
        int i = productDao.insertProduct(product);
        if (StringUtils.isEmpty(productDTO.getProductName())) {
            throw new ProductException(ProductEnum.PRODUCT_NAME_NOT_NULL);
        }
        return i > 0;
    }
}
