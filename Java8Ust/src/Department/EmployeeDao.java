/**
 * 
 */
package Department;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ustjavafsdb411
 *
 */
public class EmployeeDao {
	
	public List<Employee> getDetails(){
		List<Employee> l=new ArrayList<>();
		l.add(new Employee(1, "Jeevan", 10000));
		l.add(new Employee(2, "Sarath", 20000));
		l.add(new Employee(3, "Ram", 30000));
		l.add(new Employee(4, "Pavan", 40000));
		l.add(new Employee(5, "Yogi", 50000));
		l.add(new Employee(6, "Hemanth", 10000));
		l.add(new Employee(7, "Pratik", 20000));
		l.add(new Employee(8, "Ravi", 30000));
		l.add(new Employee(9, "Ashok", 40000));
		l.add(new Employee(10, "Naveen", 50000));
		l.add(new Employee(11, "Jeevan", 60000));
		l.add(new Employee(12, "Sarath", 70000));
		l.add(new Employee(13, "Ram", 80000));
		l.add(new Employee(14, "Pavan", 90000));
		l.add(new Employee(15, "Yogi", 51000));
		l.add(new Employee(16, "Hemanth", 60000));
		l.add(new Employee(17, "Pratik", 70000));
		l.add(new Employee(18, "Ravi", 80000));
		l.add(new Employee(19, "Ashok", 90000));
		l.add(new Employee(20, "Naveen", 510000));
		
		return l;
	}

}
