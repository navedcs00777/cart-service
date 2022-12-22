package com.okta.develope.cart.service.controller;

import com.okta.develope.cart.service.exception.CartNotFoundException;
import com.okta.develope.cart.service.model.Cart;
import com.okta.develope.cart.service.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CartController {

    @Autowired
    private CartRepository repository;

    @GetMapping("/cart/{id}")
    public Cart getCart(@PathVariable Integer id){
        return repository.findById(id).orElseThrow(() -> new CartNotFoundException("Cart not found:" + id));
    }

    @PostMapping("/cart")
    public Cart saveCart(@RequestBody  Cart cart){
        Cart saved = repository.save(cart);

        return saved;
    }

}
