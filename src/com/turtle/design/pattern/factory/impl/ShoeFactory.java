package com.turtle.design.pattern.factory.impl;

import com.turtle.design.pattern.factory.Factory;
import com.turtle.design.pattern.factory.models.Biscuit;
import com.turtle.design.pattern.factory.models.Shoes;

public class ShoeFactory implements Factory{

	private int size;
	private String color;

	private ShoeFactory() {};
	
	public ShoeFactory(int size, String color) {
		this.size = size;
		this.color = color;
	}



	public Shoes getProducts() {
		return new Shoes(size, color);
	}

}
