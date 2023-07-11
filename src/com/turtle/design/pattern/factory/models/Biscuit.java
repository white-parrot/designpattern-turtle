package com.turtle.design.pattern.factory.models;

public class Biscuit implements Product{

	private String taste;
	private String size;

	public Biscuit(String taste, String size) {
		this.taste = taste;
		this.size = size;
	}

	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Biscuit [taste=" + taste + ", size=" + size + "]";
	}
	
}
