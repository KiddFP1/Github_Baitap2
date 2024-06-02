package com.poly.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.poly.model.Cart;
import com.poly.model.CartItem;
import com.poly.model.Product;

import jakarta.servlet.http.HttpSession;

@Service
public class ShoppingCartService {

	public void addToCart(Product product, int quantity, HttpSession session) {
		Cart cart = getCart(session);
		Map<Long, CartItem> items = cart.getItems();
		if (items.containsKey(product.getId())) {
			CartItem item = items.get(product.getId());
			item.setQuantity(item.getQuantity() + quantity);
		} else {
			CartItem item = new CartItem(product, quantity);
			items.put(product.getId(), item);
		}
		session.setAttribute("cart", cart);
	}

	public Cart getCart(HttpSession session) {
		Cart cart = (Cart) session.getAttribute("cart");
		if (cart == null) {
			cart = new Cart();
			session.setAttribute("cart", cart);
		}
		return cart;
	}

	public void clearCart(HttpSession session) {
		session.removeAttribute("cart");
	}
}
