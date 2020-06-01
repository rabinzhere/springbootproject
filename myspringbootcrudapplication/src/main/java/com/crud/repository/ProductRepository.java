package com.crud.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
