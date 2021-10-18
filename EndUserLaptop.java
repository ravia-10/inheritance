package com.xworkz.inheritance;

public class EndUserLaptop {

	public static void displayInfo(Laptop objs[]) {
		System.out.println("Ram size is greater than 4 GB");
		for (int i = 0; i < objs.length; i++) {
			if (objs[i].ramSize >= 4) {
				System.out.println("----------------");
				System.out.println("name :" + objs[i].name);
				System.out.println("ramSize : " + objs[i].ramSize);
				System.out.println("cost : " + objs[i].cost);
				System.out.println("color :" + objs[i].color);
				System.out.println("-----------------");
				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		Laptop Lp1 = new Laptop("hp", 64, 34000, "red");
		Laptop Lp2 = new Laptop("Dell", 8, 52000, "black");
		Laptop Lp3 = new Laptop("sony", 2, 68000, "silver");
		Laptop Lp4 = new Laptop("lenovo", 8, 32000, "white");
		Laptop Lp5 = new Laptop("samsung", 1, 150000, "silver");
		Laptop objs[] = { Lp1, Lp2, Lp3, Lp4, Lp5 };
		EndUserLaptop.displayInfo(objs);
	}

}