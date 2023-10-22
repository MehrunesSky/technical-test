package com.github.mehrunessky.technicaltest.dao;

import com.github.mehrunessky.technicaltest.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDao extends CrudRepository<ProductEntity, String> {


    List<ProductEntity> productInStock();


}
