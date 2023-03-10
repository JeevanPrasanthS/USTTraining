package MapVsFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class PesronService {

	public static void main(String[] args) {
		List<Person> person=PersonDao.getAll();
		
		
		List<List<String>> email = person.stream().map(person1 -> person1.getPhoneNumbers())
				.collect(Collectors.toList());
		
		System.out.println(email);

		List<String> flatmap=person.stream().flatMap(person1->person1.getPhoneNumbers().stream())
				.collect(Collectors.toList());
				
			System.out.println(flatmap);
		}
}
