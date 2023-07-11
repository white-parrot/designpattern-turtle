package com.turtle.design.pattern.factory.impl;

import com.turtle.design.pattern.factory.Factory;
import com.turtle.design.pattern.factory.models.Biscuit;

public class BiscuitFactory implements Factory {

	private String taste;
	private String size;

	private BiscuitFactory() {};
	
	public BiscuitFactory(String taste, String size) {
		this.taste = taste;
		this.size = size;
	}

	@Override
	public Biscuit getProducts() {
		return new Biscuit(this.taste, this.size);
	}

}
