package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerDemo {

	public static void main(String[] args) {
		//Consumer<Integer> consumer=t -> System.out.println("Consumer method value:- "+t);
		//consumer.accept(20);
		
		List<String> list=new ArrayList<>();
		list.add("Jeevan");
		list.add("Ashok");
		list.add("Ravi");
		list.add("Ram");
		list.add("Aashish");
		
		
		System.out.println(list.stream().findAny().orElseGet(()->"Hi welcome to UST"));
		System.out.println("===========================");
		list.stream().forEach((name)-> {
			printName(()-> name);
		});
	}
			public static void printName(Supplier<String> sup) {
				System.out.println(sup.get());
			}
		
	}

