package ArrayList;

import java.util.LinkedList;

public class Zoo {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		list.add("Lion");
		list.add("Tiger");
		list.add("Elephant");
		System.out.println("Linked List "+list);
		list.add(1, "Rhino");
		System.out.println("linked List after adding "+list);
		
		
		for (String animal : list) {
			System.out.println(animal);
		//	System.out.println(",");
		}
	}
}
