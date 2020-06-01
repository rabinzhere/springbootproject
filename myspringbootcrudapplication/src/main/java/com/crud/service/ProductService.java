package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Product;
import com.crud.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	public Product saveProduct(Product product)
	{
		return repo.save(product);
	}
	public List<Product> saveProducts(List<Product> products)
	{
		return repo.saveAll(products);
	}
	
	public List<Product> getProducts()
	{
		return repo.findAll();
	}
	public Product getProductById(int id)
	{
		return repo.findById(id).orElse(null);
	}
	
	public String deleteProductById(int id)
	{
		 repo.deleteById(id);
		 return "Product Removed"+ id;
	}
	
	
}
