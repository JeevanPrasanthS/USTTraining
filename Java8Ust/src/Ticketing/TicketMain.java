/**
 * 
 */
package Ticketing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ustjavafsdb411
 *
 */
public class TicketMain {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Ticket> price=new TicketDao().getTicketDetails();
		
		
		
		
		Map<Ticket, Double> m=new HashMap<>();
	for(Ticket t:price) {
		
		double amount=5*t.getKms();
		
		m.put(t, amount);
		
	}
	//System.out.println(m);
	
	//Map<Ticket, Double> amnt=price.stream().filter(n->(n.setAmount(n.getKms()*5));
	//System.out.println(amnt);
	
	Map<Ticket, Integer> map=new LinkedHashMap<>();
	Map<Ticket, Integer> newMap = map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue())
            .collect(
                Collectors.toMap(
                    entry -> entry.getKey(), // keyMapper
                    entry -> entry.getValue(), // valueMapper
                    (first, second) -> first,  // mergeFunction
                    () -> new LinkedHashMap<>() // mapFactory
                )
            );

        newMap.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

    
	
	
	}
	

}
