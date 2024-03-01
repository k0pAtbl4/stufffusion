package com.online_store.demo.repository;

import com.online_store.demo.entity.Product;
import com.online_store.demo.entity.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query(value = "select e from Product e where e.productType =?1")
    List<Product> findByProductType(ProductType productType);


}
