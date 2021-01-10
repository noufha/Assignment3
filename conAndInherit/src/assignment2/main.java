package assignment2;

import java.util.Scanner;

public class main {
	
public static void main(String[]args) {
	String num[]= {"Necklace","Earring","Bracelet","Ring"};//array
	
	
		System.out.println("---------------------------------------");
	necklace n= new necklace();
	earring e = new earring();
	Bracelet b = new Bracelet();
	ring r = new ring();
exception z = new exception();

quote1 q = new quote1("WELCOME TO NMJ JEWELLERY");
	q.display();
	System.out.println("---------------------------------------");
	System.out.println("Enter your details for verification purpose");
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your First Name:");
	String name = scan.next();
	System.out.println("Enter age:");
	String age = scan.next();
	System.out.println("Enter your contact number:");
	String number = scan.next();
	System.out.println("Enter your Nationality:");
	String nation = scan.next();
	System.out.println("Enter your IC/ Passport Number:");
	String ic = scan.next();
	System.out.println("Enter your Email Address:");
	String mail = scan.next();
	
	System.out.println("---------------------------------------");
	System.out.println("Customer Details:");
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Contact Number: "+number);
	System.out.println("Nationality: "+nation);
	System.out.println("Ic/ Passport Number: "+ic);
	System.out.println("Email ID: "+mail);
	System.out.println("---------------------------------------");
		System.out.println("Available products: ");
		System.out.println("---------------------------------------");
		System.out.println("1: " + num[0]+"\n2: " +num[1]+"\n3: " +num[2]+"\n4: " + num[3]);
		z.selection();
		
		System.out.println("\n---------------------------------------");
	System.out.println("HERE IS THE DESCRIPTION OF OUR PRODUCTS");
	System.out.println("---------------------------------------");
		System.out.println("Available Variety of Necklace: ");
		n.necklace();
		n.metal();
		n.run();
		
		System.out.println("\n---------------------------------------");
		System.out.println("Available Variety of Earring: ");
		e.earring();
		e.metal();
		e.run();
		
		System.out.println("\n---------------------------------------");
		System.out.println("Available Variety of Bracelets: ");
		b.bracelet();
		b.metal();
		b.run();
		
		System.out.println("\n---------------------------------------");
		System.out.println("Available Variety of Ring: ");
		r.ring();
		b.metal();
		r.run();
		System.out.println("------------------------------------------");
		
		
		
}
}