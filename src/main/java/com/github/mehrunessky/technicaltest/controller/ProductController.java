package com.github.mehrunessky.technicaltest.controller;

import com.github.mehrunessky.technicaltest.dao.ProductDao;
import com.github.mehrunessky.technicaltest.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {


    private final ProductDao productDao;


    @GetMapping("/")
    public List<ProductEntity> getProducts() {
        return StreamUtils
            .createStreamFromIterator(
                productDao
                    .findAll()
                    .iterator()
            )
            .toList();
    }

    @GetMapping("/instocks")
    public List<ProductEntity> getProductsInStock() {
        return productDao.productInStock();
    }

}
