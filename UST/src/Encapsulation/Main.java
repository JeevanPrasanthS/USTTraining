package Encapsulation;

public class Main {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(1234);
		e.setName("Jeevan");
		e.setLocation("BAN");
		System.out.println(e.getId()+" "+e.getName()+" "+e.getLocation());
	}
}
