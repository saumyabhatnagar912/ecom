package com.myapp.mywarapp.model;

import java.util.List;

import org.springframework.stereotype.Controller;

@Controller
public class Cart {

	private List<Order> cartList;

	public List<Order> getCartList() {
		return cartList;
	}

	public void setCartList(List<Order> cartList) {
		this.cartList = cartList;
	}


}
