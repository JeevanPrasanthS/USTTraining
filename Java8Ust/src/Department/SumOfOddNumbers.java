package Department;

import java.util.List;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		var v=List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		var s=v.stream().filter(n->n%2!=0).reduce(0,(n1,n2)->n1+n2);
		System.out.println(s);
	}
}
