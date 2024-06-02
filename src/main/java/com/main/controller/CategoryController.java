package com.main.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.main.Entity.Category;
import com.main.Repository.CategoryDAO;

@Controller
public class CategoryController {
	@Autowired
	CategoryDAO dao;

	@GetMapping("/index")
	public String index2() {
		return "/index";
	}

	public void resetForm(@ModelAttribute("Category") Category ca) {
		ca.setId(null);
		ca.setName(null);
	}

	@RequestMapping("/category/index")
	public String index(Model model, @ModelAttribute("Category") Category ca) {
		resetForm(ca);
		model.addAttribute("CategoryItem", dao.findAll());
		return "/category/index";
	}

	@RequestMapping("/category/create")
	public String Create(Model model, @ModelAttribute("Category") @Validated Category ca, Errors errors)
			throws IllegalStateException, IOException {
		if (errors.hasErrors()) {
			model.addAttribute("error", errors);
		} else {
			if (!dao.findById(ca.getId()).isEmpty()) {
				model.addAttribute("message", "Category ID already exist!");
			} else {
				model.addAttribute("CategoryItem", dao.save(ca));
				model.addAttribute("message", "Successfully!");
			}
		}
		model.addAttribute("CategoryItem", dao.findAll());
		return "/category/index";

	}

	// update category by id in form
	@RequestMapping("/category/update")
	public String Update(Model model, @ModelAttribute("Category") Category ca, Errors errors) {
		if (ca.getId().isBlank()) {
			model.addAttribute("message", "Choose category ID you want to update!");
		} else {
			dao.save(ca);
			model.addAttribute("message", "Successfully!");
		}
		model.addAttribute("CategoryItem", dao.findAll());
		return "/category/index";

	}

	// edit category by id in table
	@RequestMapping("/category/edit/{id}")
	public String Edit(Model model, @PathVariable("id") String id, @ModelAttribute("Category") Category ca) {
		Category category = dao.findById(id).get();
		ca.setId(category.getId());
		ca.setName(category.getName());
		model.addAttribute("CategoryItem", dao.findAll());
		return "/category/index";
	}

	// remove category by id in table
	@RequestMapping("/category/remove/{id}")
	public String Delete(Model model, @PathVariable("id") String id, @ModelAttribute("Category") Category ca) {
		if (id.isBlank()) {
			model.addAttribute("message", "Choose category ID you want to remove!");
		} else {
			dao.deleteById(id);
			model.addAttribute("message", "Successfully!");
			resetForm(ca);
		}
		model.addAttribute("CategoryItem", dao.findAll());
		return "/category/index";
	}

	// remove category by id in form
	@RequestMapping("/category/delete")
	public String Delete(Model model, @ModelAttribute("Category") Category ca, Errors errors) {
		if (ca.getId().isBlank()) {
			model.addAttribute("message", "Choose category ID you want to remove!");
		} else {
			dao.deleteById(ca.getId());
			resetForm(ca);
			model.addAttribute("message", "Successfully!");
		}
		model.addAttribute("CategoryItem", dao.findAll());
		return "/category/index";
	}

}
