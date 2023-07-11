package com.turtle.design.pattern.factory.models;

public class Shoes implements Product{

	private int size;
	private String color;

	public Shoes(int size, String color) {
		this.size = size;
		this.color = color;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shoes [size=" + size + ", color=" + color + "]";
	}
}
