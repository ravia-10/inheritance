package com.xworkz.inheritance;

public class Laptop {

	String name;
	int ramSize;
	int cost;
	String color;

	public Laptop(String name, int ramSize, int cost, String color) {
		this.name = name;
		this.ramSize = ramSize;
		this.cost = cost;
		this.color = color;

	}

	public void turnOn() {
		System.out.println("Laptop Turned On ");
	}

	public void createFolder() {
		System.out.println(" folder is created");
	}

	public void turnOff() {
		System.out.println("Laptop Turned Off");
	}
}