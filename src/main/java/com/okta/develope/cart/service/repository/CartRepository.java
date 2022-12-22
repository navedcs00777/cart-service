package com.okta.develope.cart.service.repository;

import com.okta.develope.cart.service.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}