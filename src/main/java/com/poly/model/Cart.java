package com.poly.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {

	private Map<Long, CartItem> items = new HashMap<>();

	public Map<Long, CartItem> getItems() {
		return items;
	}

	public void setItems(Map<Long, CartItem> items) {
		this.items = items;
	}

	public double getTotalPrice() {
		return items.values().stream().mapToDouble(CartItem::getTotalPrice).sum();
	}
}
