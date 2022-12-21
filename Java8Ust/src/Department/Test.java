/**
 * 
 */
package Department;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author ustjavafsdb411
 *
 */
public class Test {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emp=new EmployeeDao().getDetails();
		//emp.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
		
		for(int i=0;i<emp.size();i++) {
			for(int j=0;j<emp.size();j++) {
				if(emp.get(i).getSalary()==emp.get(j).getSalary()) {
					int v=(int) (emp.get(i).getSalary()+emp.get(j).getSalary());
					emp.get(i).setSalary(v);
					emp.remove(j);
				}
			}
		}
		emp.sort(Comparator.comparing(Employee::getEid));
		
		System.out.println(emp);
		
	
		
		

	}

}
