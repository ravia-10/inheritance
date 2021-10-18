package com.xworkz.inheritance;

public class PhonePayV001 {

	String name;
	String version;
	int releaseYear;

	public PhonePayV001(String name, String version, int releaseYear) {
		this.name = name;
		this.version = version;
		this.releaseYear = releaseYear;
	}

	public static void transferMoney() {
		System.out.println(" Money is Transferred successfully");
	}

	public static void rechargeMobile() {
		System.out.println(" Recharged  successfull");
	}

	public static void electricityBill() {
		System.out.println(" Electricity bill paid successfull");
	}

	public static void bookACylinder() {
		System.out.println("  Cylinder is booked successfull ");
	}

}