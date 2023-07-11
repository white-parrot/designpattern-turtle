package com.turtle.design.pattern.factory;

import com.turtle.design.pattern.factory.impl.BiscuitFactory;
import com.turtle.design.pattern.factory.impl.ShoeFactory;

public class Customer {

	public static void main(String[] args) {
		Company biscuitCompany = new Company(new BiscuitFactory("sweet", "small"));
		biscuitCompany.sellProduct();
		
		Company shoeCompany = new Company(new ShoeFactory(7, "tan"));
		shoeCompany.sellProduct();
	}
}
