/**
 * 
 */
package EmployeeSort;

import java.util.List;
import java.util.Set;

/**
 * @author ustjavafsdb411
 *
 */
public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> set=new EmployeeDao().sortingDetails();
		
		
		for(Employee s:set) {
			
					   for (int i = 0; i < set.size(); i++) {   
				            for (int j = i+1; j < set.size(); j++) {   
				               if(set.get(i) set.get(j)) {  
				                  
				               }   
				            }   
				        }  
						
					}
				
			
			
		}

	}


