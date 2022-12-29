package Inheritance;

public class Car extends Vehicle {

	String brand;
	String model;
	
	@Override
	void wheels(int numberOfWheels) {
		
		super.wheels(numberOfWheels);
		
		System.out.println("Brand name:- "+brand);
		System.out.println("Model Name:- "+model);
		System.out.println("Number of Wheels:- "+numberOfWheels);
	}
	
	
	public Car() {
		super();
	}
	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}


	public static void main(String[] args) {
		Car c=new Car("Mahendra", "XUV700");
		c.wheels(4);
	}
}
