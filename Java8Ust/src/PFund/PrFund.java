package PFund;

public class PrFund {

	private int id;
	private String name;
	private String location;
	private Double salary;

	private Double pfDeduct;
	
	public Double getPfDeduct() {
		return pfDeduct;
	}
	public void setPfDeduct(Double pfDeduct) {
		this.pfDeduct = pfDeduct;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	
	public PrFund() {
		super();
	}
	public PrFund(int id, String name, String location, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "PrFund [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}
	
	
	
	
}
