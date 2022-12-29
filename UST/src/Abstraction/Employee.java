package Abstraction;

public class Employee extends Person {

	public int eid;
	
	public Employee(String name,String gender,int eid) {
		super(name,gender);
		this.eid=eid;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		if(eid==0) {
			System.out.println("He is not Employee in this Company");
		}else {
			System.out.println("He is a Working Employee");
		}
		
	}
	
	
}
