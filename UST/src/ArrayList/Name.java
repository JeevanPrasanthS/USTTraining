/**
 * 
 */
package ArrayList;

import java.util.LinkedList;

/**
 * @author ustjavafsdb411
 *
 */
public class Name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> li=new LinkedList<>();
		li.add("Jeevan");
		li.add("Prasanth");
		li.add("Sunil");
		li.add("Sharath");
		li.add("Kumar");
		li.add("Sasi");
		
		
		
		for (String names : li) {
			if(names.startsWith("S")) {
				System.out.println(names);
			}
		}
	}

}
