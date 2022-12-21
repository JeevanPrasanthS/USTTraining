package Employee;

public class Model {

	private int ustId;
	private String name;
	private String location;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getUstId() {
		return ustId;
	}
	public void setUstId(int ustId) {
		this.ustId = ustId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public Model() {
		super();
	}
	public Model(int ustId, String name, String location,double salary) {
		super();
		this.ustId = ustId;
		this.name = name;
		this.location = location;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Model [ustId=" + ustId + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
