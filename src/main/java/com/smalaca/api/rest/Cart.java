package com.smalaca.api.rest;

public class Cart {

	
	private int itemCount =0;

	public void addItemToCart(String productId) {
		itemCount ++;
	}

	public boolean hasItems() {
		return itemCount>0;
	}
	
	
}
