package com.controller;

import com.abstracts.AbstractController;
import com.convert.Product2ProductDTOConvert;
import com.dto.ProductDTO;
import com.pojo.Product;
import com.services.ProductService;
import com.util.ResultUtils;
import com.util.ResultVO;
import com.vo.ProductVO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author：linma
 * @date: 2018/10/24 15:15
 * @email: linma@homeinns.com
 **/
@RestController
@RequestMapping("/homeinns")
public class ProductController extends AbstractController {

    @Autowired
    private ProductService productService;

    @ApiOperation(value = "根据产品id查询产品具体信息", notes = "根据产品id查询产品具体信息")
    @ApiImplicitParam(name = "id", value = "商品id", dataType = "Integer",
            paramType = "query")
    @GetMapping("/getproductbyid")
    public ResultVO getProductById(Integer id) {
        ProductDTO productDTO = null;
        productDTO = productService.getProductBId(id);
        ProductVO productVO = new ProductVO();
        BeanUtils.copyProperties(productDTO, productVO);
        return ResultUtils.success(productVO);
    }

    @PostMapping("/insertproduct")
    @ApiOperation(value = "增加商品信息", notes = "增加商品信息")
    public ResultVO insertProduct(@RequestBody Product product) {
        ProductDTO productDTO = Product2ProductDTOConvert.covert(product);
        boolean flag = productService.insertProduct(productDTO);
        return ResultUtils.success(flag);
    }

    @GetMapping("/getproductall")
    @ApiOperation(value = "查询所有商品信息", notes = "查询所有商品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "startPage", value = "起始页", dataType = "Integer",
            paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "每页要显示的数据", dataType = "Integer",
            paramType = "query")}
    )
    public ResultVO getProductAll(Integer startPage, Integer pageSize) {
        List<ProductDTO> productAll = productService.findProductAll(startPage, pageSize);
        List<ProductVO> productVOS = productAll.stream().map(productDTO -> {
            ProductVO productVO = new ProductVO();
            BeanUtils.copyProperties(productDTO, productVO);
            return productVO;
        }).collect(Collectors.toList());
        return ResultUtils.success(productVOS);
    }

}
