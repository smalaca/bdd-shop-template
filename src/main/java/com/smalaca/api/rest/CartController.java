package com.smalaca.api.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	@PostMapping("/add/{productId}")
	public ResponseEntity<String> addToCart(@PathVariable("productId") String productId){
		cartService.addToCurrentBasket(productId);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}
}
