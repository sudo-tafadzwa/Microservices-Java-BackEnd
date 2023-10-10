package com.brinklet.productservice.controller;

import com.brinklet.productservice.Model.Product;
import com.brinklet.productservice.dto.ProductRequest;
import com.brinklet.productservice.dto.ProductResponse;
import com.brinklet.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createdProduct(@RequestBody ProductRequest productRequest){
    productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }
}
