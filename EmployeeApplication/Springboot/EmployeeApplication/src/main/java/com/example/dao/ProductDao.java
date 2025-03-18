package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Products;

public interface ProductDao extends JpaRepository<Products, Integer> {

}
