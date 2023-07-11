package com.turtle.design.pattern.factory;

public class Company {
	
	private Factory factory;
	
	public Company(Factory factory) {
		this.factory = factory;
	}
	
	public void sellProduct() {
		System.out.println(factory.getProducts().toString());
	}

	@Override
	public String toString() {
		return "Company [factory=" + factory + "]";
	}
	
}
