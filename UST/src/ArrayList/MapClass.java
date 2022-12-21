package ArrayList;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(101, "Prasanth");
		map.put(102, "Kiran");
		map.put(103, "Sunil");
		map.put(104, "sarath");
		map.put(105, "Riyaz");
		map.put(106, "Suresh");
		
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			
			if(val.startsWith("S")||val.startsWith("s")) {
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		}
	}
}
