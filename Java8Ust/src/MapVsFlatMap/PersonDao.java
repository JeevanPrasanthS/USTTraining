package MapVsFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonDao {

	
	
	public static List<Person> getAll(){
		return Stream.of(new Person(101,"Jeevan","Jeevan@gmail.com","HYD",Arrays.asList("85228","07703")),
				new Person(102,"Prasanth","Prasanth@gmail.com","HYD",Arrays.asList("12345","67890")),
				new Person(103,"Ravi","Ravi@gmail.com","HYD",Arrays.asList("67890","12345")),
				new Person(104,"Sunil","Sunil@gmail.com","HYD",Arrays.asList("09876","54321"))
				).collect(Collectors.toList()
				
				);
	}
}
