package PFund;

import java.util.ArrayList;
import java.util.List;

public class PfDao {

	public List<PrFund> getDetails(){
		List<PrFund> list=new ArrayList<>();
		list.add(new PrFund(121, "Jeevan", "HYD", 35000.00));
		list.add(new PrFund(211, "Ram", "BAN", 22000.00));
		list.add(new PrFund(357, "Pavan", "BZA", 57000.00));
		list.add(new PrFund(482, "Sunil", "VIZ", 83000.00));
		list.add(new PrFund(562, "Rohit", "KRL", 15000.00));
		return list;
		
	}
}
