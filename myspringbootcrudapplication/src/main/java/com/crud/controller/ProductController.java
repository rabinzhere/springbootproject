package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Product;
import com.crud.service.ProductService;

@RestController
public class ProductController {
	
    @Autowired
	private ProductService ps;
    
    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product)
    {
    	return ps.saveProduct(product);
    }
    
    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products)
    {
    	return ps.saveProducts(products);
    } 
    
    @GetMapping("/getproducts")
    public List<Product> getProducts()
    {
    	return ps.getProducts();
    }
    
    @GetMapping("/getproductbyId/{id}")
    public Product getProductById(@PathVariable int id)
    {
    	return ps.getProductById(id);
    }
    
    @DeleteMapping("/deleteproductbyId/{id}")
    public String deleteProductById(@PathVariable int id)
    {
    	return ps.deleteProductById(id);
    }
}
