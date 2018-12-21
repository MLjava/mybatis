package com.services.impl;

import com.abstracts.AbstractService;
import com.dao.ProductDao;
import com.dto.ProductDTO;
import com.enums.ProductEnum;
import com.exception.HomeinnsException;
import com.exception.ProductException;
import com.github.pagehelper.PageHelper;
import com.pojo.Product;
import com.services.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        int record = productDao.insertProduct(product);
        if (StringUtils.isEmpty(productDTO.getProductName())) {
            throw new ProductException(ProductEnum.PRODUCT_NAME_NOT_NULL);
        }
        return record > 0;
    }

    @Override
    public List<ProductDTO> findProductAll(Integer startPage, Integer pageSize) {
        // 校验分页参数
        Map<String, Integer> pager = validatePager(startPage, pageSize);
        // 开始使用分页组件
        log.info("==== 分页查询数据！ ====");
        PageHelper.startPage(pager.get("startPage"), pager.get("pageSize"));
        List<Product> products = productDao.findProductAll();
        if (products == null || products.size() == 0) {
            throw new ProductException(ProductEnum.PRODUCT_IS_EMPTY);
        }
        // - 使用stream表达式
        return products.stream().map(product -> {
             ProductDTO productDTO = new ProductDTO();
             BeanUtils.copyProperties(product, productDTO);
             return productDTO;
         }).collect(Collectors.toList());
    }

    @Override
    @Transactional(rollbackFor = HomeinnsException.class)
    public boolean updateProduct(ProductDTO productDTO) {
        if (productDTO.getId() == null) {
            throw new ProductException(ProductEnum.PRODUCT_ID_IS_NOT_NULL);
        }
        Product product = new Product();
        BeanUtils.copyProperties(productDTO, product);
        product.setUpdateTime(new Date());
        int record = productDao.updateProduct(product);
        return record > 0;
    }

    @Override
    @Transactional(rollbackFor = HomeinnsException.class)
    public boolean deleteProduct(Integer productId) {
        if (productId == null) {
            throw new ProductException(ProductEnum.PRODUCT_ID_IS_NOT_NULL);
        }
        Product product = new Product();
        product.setFlag(1);
        product.setId(productId);
        product.setUpdateTime(new Date());
        int record = productDao.updateProduct(product);
        return record > 0;
    }

    @Override
    public List<ProductDTO> fuzzySearchProductByName(String productName) {
        if (StringUtils.isEmpty(productName)) {
            throw new ProductException(ProductEnum.PRODUCT_NAME_NOT_NULL);
        }
        List<Product> products = productDao.fuzzySearchProductByName(productName);
        if (products.size() == 0) {
            throw new ProductException(ProductEnum.PRODUCT_NOT_EXIST);
        }
        return products.stream().map(product -> {
            ProductDTO productDTO = new ProductDTO();
            BeanUtils.copyProperties(product, productDTO);
            return productDTO;
        }).collect(Collectors.toList());
    }
}
