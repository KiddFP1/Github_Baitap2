package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.model.Cart;
import com.poly.model.Product;
import com.poly.service.ProductService;
import com.poly.service.ShoppingCartService;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/cart")
public class ShoppingCartController {

	@Autowired
	private ShoppingCartService shoppingCartService;

	@Autowired
	private ProductService productService;

	@PostMapping("/add")
	public String addToCart(@RequestParam Long productId, @RequestParam int quantity, HttpSession session) {
		Product product = productService.getProduct(productId);
		shoppingCartService.addToCart(product, quantity, session);
		return "redirect:/cart";
	}

	@GetMapping
	public String showCart(HttpSession session, Model model) {
		Cart cart = shoppingCartService.getCart(session);
		model.addAttribute("cartItems", cart.getItems().values());
		model.addAttribute("totalPrice", cart.getTotalPrice());
		return "cart";
	}

	@GetMapping("/products")
	public String showProducts(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "product-list";
	}
}
