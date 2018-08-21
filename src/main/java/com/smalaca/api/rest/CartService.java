package com.smalaca.api.rest;

import org.springframework.stereotype.Component;

@Component
public class CartService {
	
	private Cart currentCart;
	
	public boolean hasItemsInCurrentBasket() {
		return currentCart!=null && currentCart.hasItems();
	}

	public void addToCurrentBasket(String productId) {
		if(currentCart==null) {
			currentCart = new Cart();
		}
		currentCart.addItemToCart(productId);
		
	}

}
