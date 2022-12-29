package Abstraction;

public class Main {

	public static void main(String[] args) {
		Person e=new Employee("Jeevan", "M", 123);
		e.work();
		e.changeName("Prasanth");
		System.out.println(e.toString());
	}
}
