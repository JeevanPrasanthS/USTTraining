package Constructor;

public class Employee {

	int ustId;
	String name;
	String location;
	double salary;
	
	//default constructor
//	public Employee() {
//		System.out.println("welcome to UST");
//	}
	void display() {
		System.out.println("my Name is "+name+" Working in UST with USTID:- "+ustId+" in Location "+location+" with salary "+salary);
	}
	
	
	
	public Employee(int ustId, String name, String location, double salary) {
		super();
		this.ustId = ustId;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	public static void main(String[] args) {
		Employee e=new Employee(224296, "Jeevan", "Bangalore", 10000.00);
		e.display();
	}
}
