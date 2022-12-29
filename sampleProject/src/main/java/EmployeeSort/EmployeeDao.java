/**
 * 
 */
package EmployeeSort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ustjavafsdb411
 *
 */
public class EmployeeDao {

	public List<Employee> sortingDetails(){
		List<Employee> sort=new ArrayList<>();
		
		sort.add(new Employee(152, "Jeevan"));
		sort.add(new Employee(102, "Ram"));
		sort.add(new Employee(186, "Sunil"));
		sort.add(new Employee(29, "Riyaz"));
		sort.add(new Employee(222, "Sai"));
		
	//	System.out.println(sort);
		return  sort;
		
	}
}
