package com.vc.tools.store.repository;

import org.springframework.data.repository.CrudRepository;

import com.vc.tools.store.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
