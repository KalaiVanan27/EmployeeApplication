package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.entity.Products;
import com.example.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	@GetMapping("/")
	public String viewHomePage() {

		return "index";

	}

	@GetMapping("/New")
	public String addPage(Model model) {
		
		model.addAttribute("product",new Products());
		return "New";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Products p) {

		service.saveProduct(p);
		return "redirect:/";
	}
}
