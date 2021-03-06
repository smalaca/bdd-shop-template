package com.smalaca.api.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class TemplateController {
	
	@Autowired
	private CartService cartService;

    @PostMapping("/creditcard")
    public ResponseEntity<String> processCreditCardDetails(@Validated CreditCardDetails details) {
    	if(cartService.hasItemsInCurrentBasket()) {
    		return new ResponseEntity<>(HttpStatus.ACCEPTED);
    	}
    	return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    	
    }
}
