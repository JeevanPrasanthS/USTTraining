package Optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import Employee.EmployeeDao;
import Employee.Model;

public class HandleOptional {

	
	  public static void main(String[] args)  throws Exception{
	        List<Model> m= new EmployeeDao().getModel();
	        Optional<List<Model>> optionalString=Optional.ofNullable(m);
	       // System.out.println(optionalString.isPresent());
	        optionalString.ifPresent(value->{
	            System.out.println(value);
	        });

	    }
	}

