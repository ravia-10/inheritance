package com.xworkz.inheritance;

public class EndUser {

	public static void displayInfo(PhonePayV001 obj[]) {
		System.out.println("Phonepay Information");
		System.out.println();
		for (int i = 0; i < obj.length; i++) {
			System.out.println("-----------------");
			System.out.println("Name : " + obj[i].name);
			System.out.println("version : " + obj[i].version);
			System.out.println("year : " + obj[i].releaseYear);
			System.out.println("-----------------");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		PhonePayV001 V001 = new PhonePayV001("Phone pay", "V001", 2015);
		PhonePayV001 V002 = new PhonePayV001("Phone pay", "V002", 2016);
		PhonePayV001 V003 = new PhonePayV001("Phone pay", "V003", 2017);
		PhonePayV001 V004 = new PhonePayV001("Phone pay", "V004", 2018);

		PhonePayV001 obj[] = { V001, V002, V003 ,V004 };
		EndUser.displayInfo(obj);

	}

}