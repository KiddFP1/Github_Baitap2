package com.main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.Entity.Product;
import com.main.Repository.ProductDAO;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductDAO dao;

	@RequestMapping("/sort")
	public String sort(Model model, @RequestParam("field") Optional<String> field) {
		System.out.println(field);
		Sort sort = Sort.by(Direction.DESC, field.orElse("price"));
		model.addAttribute("field", field.orElse("price").toUpperCase());
		List<Product> items = dao.findAll(sort);
		model.addAttribute("items", items);
		return "/product/sort";
	}

	@RequestMapping("/page")
	public String paginate(Model model, @RequestParam("page") Optional<Integer> page) {
		Pageable pageable = PageRequest.of(page.orElse(0), 6);
		model.addAttribute("page", dao.findAll(pageable));
		return "/product/page";
	}
}
