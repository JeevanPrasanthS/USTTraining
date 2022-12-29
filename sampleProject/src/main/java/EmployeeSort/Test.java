/**
 * 
 */
package EmployeeSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	List<Employee> list=new EmployeeDao().sortingDetails();
	for(int i=0;i<list.size();i++) {
		for(int j=0;j<list.size();j++) {
			if(list.get(i).getId()>list.get(j).getId()) {
				Employee tmp=list.get(i);
				list.set(i, list.get(j));
				list.set(j, tmp);
			}
		}
	}
	System.out.println(list);
	
	
	
	}
		
		

}
