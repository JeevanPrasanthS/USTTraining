package Employee;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService {
	
	public List<Model> getEmployeeSort(){
		
		List<Model> emps=new EmployeeDao().getModel();
		
		//Collections.sort(emps,(o1,o2)->o1.getName().compareTo(o2.getName()));
		
		
		
		System.out.println(emps.stream().filter(n->n.getLocation().contentEquals("BAN")).collect(Collectors.toList()));
		return emps;
		
	}

	public static void main(String[] args) {
	//	System.out.println(new EmployeeService().getEmployeeSort()
	//			);
		EmployeeService e=new EmployeeService();
		e.getEmployeeSort();
				
	}
}
