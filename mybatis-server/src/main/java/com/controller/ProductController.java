package com.controller;

import com.dto.ProductDTO;
import com.exception.ProductException;
import com.pojo.Product;
import com.services.ProductService;
import com.abstracts.AbstractService;
import com.util.ResultUtils;
import com.util.ResultVO;
import com.vo.ProductVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author：linma
 * @date: 2018/10/24 15:15
 * @email:linma@homeinn.com
 **/
@RestController
@RequestMapping("/homeinns")
public class ProductController extends AbstractService {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "根据产品id查询产品具体信息", notes = "根据产品id查询产品具体信息")
    @ApiImplicitParam(name = "id", value = "商品id", dataType = "Integer",
            paramType = "query")
    @GetMapping("/getproductid")
    public ResultVO getProductById(Integer id) {
        ProductDTO productDTO = null;
        try {
            productDTO = productService.getProductBId(id);
        } catch (ProductException e) {
            return ResultUtils.failure(e);
        }
        ProductVO productVO = new ProductVO();
        BeanUtils.copyProperties(productDTO, productVO);
        return ResultUtils.success(productVO);
    }

    @PostMapping("/insertproduct")
    @ApiOperation(value = "增加商品信息", notes = "增加商品信息")
    public ResultVO insertProduct(@RequestBody Product product) {
        ResultVO resultVO = new ResultVO();
        ProductDTO productDTO = new ProductDTO();
        productDTO.setProductName(product.getProductName());
        productDTO.setProductPrice(product.getProductPrice());
        productDTO.setProductCategory(product.getProductCategory());
        boolean flag = false;
        try {
            flag = productService.insertProduct(productDTO);
        } catch (ProductException e) {
            return ResultUtils.failure(e);
        }
        return ResultUtils.success(flag);
    }

}
