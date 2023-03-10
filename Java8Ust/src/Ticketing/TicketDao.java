package Ticketing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TicketDao {

	
	public Map<Ticket, Double> getTicketDetails(Double price) {
		HashMap<Ticket, Double> map=new HashMap<>();
		map.put(new Ticket(101, "Jeeavn", "Hyd", "Pgrl", 255), price);
		map.put(new Ticket(102, "Prasanth", "Ban", "Chennai", 400), price);
		map.put(new Ticket(103, "Ram", "Hyd", "Ban", 450), price);
		map.put(new Ticket(104, "Sunil", "Ban", "Atp", 200), price);
		map.put(new Ticket(105, "Sharath", "Hyd", "Nrt", 270), price);
		
		return map;
	}
	public List<Ticket> getTicketDetails() {
		List<Ticket> map=new ArrayList<>();
		map.add(new Ticket(101, "Jeeavn", "Hyd", "Pgrl", 255));
		map.add(new Ticket(102, "Prasanth", "Ban", "Chennai", 400));
		map.add(new Ticket(103, "Ram", "Hyd", "Ban", 450));
		map.add(new Ticket(104, "Sunil", "Ban", "Atp", 200));
		map.add(new Ticket(105, "Sharath", "Hyd", "Nrt", 270));
		
		return map;
	}
	
}
