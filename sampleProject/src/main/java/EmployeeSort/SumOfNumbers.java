/**
 * 
 */
package EmployeeSort;

import java.util.Arrays;
import java.util.List;

/**
 * @author ustjavafsdb411
 *
 */
public class SumOfNumbers {

	public void sumOf() {
		List<Integer> list=Arrays.asList(8,7,3,2,5,1);
		int target=10;
		int totalSum = list.stream().reduce(target, (number1, number2) -> number1 + number2);
		
		System.out.println("Sum of integers : "+totalSum);
	}
}
