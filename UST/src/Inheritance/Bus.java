package Inheritance;

public class Bus extends Vehicle{

	String brand;
	String model;
	
	public void display() {
		System.out.println("Brand name:- "+brand+", Model name:- "+model+" ,No of Wheels:- "+numberOfWheels);
	}
	
}
