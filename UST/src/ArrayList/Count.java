package ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count {

	public static void main(String[] args) {	
	
		 String phrase = "I am Jeevan and I am Working with UST";

	        HashMap<String, Integer> map = new HashMap<String, Integer>();
	        String[] ignored = phrase.split(" ");

	        //CAN BE FIX THIS POINT ON.
	        for (String ignore : ignored) 
	        {
	            Integer count = map.get(ignore);
	            if (count == null) 
	            {
	                count = 0;
	            }
	            map.put(ignore, count + 1);
	        }
	        System.out.println(map);
	        
	        
	        Map<String,Long> wordCount = Arrays.stream(phrase.toLowerCase().split(" "))
	    		    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	        System.out.println(wordCount);
	    }
	
	
	}
	

