package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("Jeevan");
		list.add("Ravi");
		list.add("Sunil");
		System.out.println(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}
}
