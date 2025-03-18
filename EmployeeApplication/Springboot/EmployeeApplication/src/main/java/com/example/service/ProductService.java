package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.ProductDao;
import com.example.entity.Products;

@Service
public class ProductService {
	@Autowired
	private ProductDao dao;

	// Save , Update , Delete , Get

	public void saveProduct(Products p) 
	{
		dao.save(p);
	}
	
	public void deleteProduct(int id)
	{
		dao.deleteById(id);
	}
	
	public Products update(int id) 
	{
		return dao.findById(id).get();
		
	}
	
	public List<Products> retrive()
	{
		return dao.findAll();
		
	}
}
